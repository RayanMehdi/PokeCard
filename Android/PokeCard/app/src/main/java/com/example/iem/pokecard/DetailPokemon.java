package com.example.iem.pokecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iem.pokecard.Model.Pokemon;
import com.squareup.picasso.Picasso;

public class DetailPokemon extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pokemon);
        Intent intent = getIntent();


        ImageView viewPokemon = (ImageView)findViewById(R.id.imageViewPokemon);
        TextView tvNom = (TextView)findViewById(R.id.textViewNom);
        TextView tvAtt = (TextView)findViewById(R.id.textViewAttRecup);
        TextView tvDef = (TextView)findViewById(R.id.textViewDefRecup);
        TextView tvPv = (TextView)findViewById(R.id.textViewPvRecup);
        TextView tvSpA = (TextView)findViewById(R.id.textViewAttSpeRecup);
        TextView tvSpD = (TextView)findViewById(R.id.textViewDefSpeRecup);
        TextView tvSpe = (TextView)findViewById(R.id.textViewVitRecup);

        Pokemon pokemon = (Pokemon)intent.getSerializableExtra("Pokemon");
        tvNom.setText(pokemon.getName());
        tvAtt.setText(String.valueOf(pokemon.getAtt()));
        tvDef.setText(String.valueOf(pokemon.getDef()));
        tvPv.setText(String.valueOf(pokemon.getPv()));
        tvSpA.setText(String.valueOf(pokemon.getSpA()));
        tvSpD.setText(String.valueOf(pokemon.getSpD()));
        tvSpe.setText(String.valueOf(pokemon.getSpe()));
        Picasso.with(getBaseContext()).load(pokemon.getIcon()).into(viewPokemon);




    }
}