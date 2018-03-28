package com.example.iem.pokecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.iem.pokecard.Manager.Manager_WS;
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

        Manager_WS ws = new Manager_WS(PokeList, adapter);
        ws.getList();

        PokemonList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(ListPokemon.this, DetailPokemon.class);
                        intent.putExtra("Pokemon", PokeList.get(i));
                        startActivity(intent);
                    }
                });

            }
        }
