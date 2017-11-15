package com.example.iem.pokecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailPokemon extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pokemon);

        ImageView viewPokemon = (ImageView)findViewById(R.id.imageViewPokemon);
        TextView tvNom = (TextView)findViewById(R.id.textViewNom);
        TextView tvStat = (TextView)findViewById(R.id.textViewStats);
        Picasso.with(getBaseContext()).load("http://i.imgur.com/DvpvklR.png").into(viewPokemon);




    }
}