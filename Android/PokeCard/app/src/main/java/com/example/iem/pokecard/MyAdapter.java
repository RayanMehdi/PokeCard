package com.example.iem.pokecard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.iem.pokecard.Model.Pokemon;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 14/11/2017.
 */

public class MyAdapter extends ArrayAdapter<Pokemon> {




    public MyAdapter(Context context, ArrayList<Pokemon> pokemons) {
        super(context, 0, pokemons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_poke_list,parent, false);
        }

        PokemonViewHolder viewHolder = (PokemonViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PokemonViewHolder();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Pokemon pokemon = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.nom.setText(pokemon.getName());
        Picasso.with(this.getContext()).load(pokemon.getIcon()).into(viewHolder.img);

        return convertView;
    }

    private class PokemonViewHolder{
        public TextView nom;
        public ImageView img;
    }
}