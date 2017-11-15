package com.example.iem.pokecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.iem.pokecard.Model.Pokemon;

import java.util.ArrayList;

public class ListPokemon extends AppCompatActivity {

    ListView PokemonList;
    ArrayList<Pokemon>PokeList;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_pokemon);
        PokeList = new ArrayList<>();

        PokemonList  = (ListView)findViewById(R.id.listeViewPokeList);

        adapter = new MyAdapter(ListPokemon.this, PokeList);
        PokemonList.setAdapter(adapter);
        //TextView tvTest = (TextView)findViewById(R.id.textView2);

        Async recupPoke = new Async();
        recupPoke.execute(PokeList, adapter);


    }
}