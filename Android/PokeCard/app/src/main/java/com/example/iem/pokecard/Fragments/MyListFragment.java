package com.example.iem.pokecard.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.iem.pokecard.Activity.DetailPokemon;
import com.example.iem.pokecard.Manager.Manager_WS;
import com.example.iem.pokecard.Model.Pokemon;
import com.example.iem.pokecard.MyAdapter;
import com.example.iem.pokecard.PokemonApplication;
import com.example.iem.pokecard.R;

import java.util.ArrayList;

/**
 * Created by alexandre on 04/04/2018.
 */

public class MyListFragment extends Fragment {
    public MyListFragment() {
    }
    ListView PokemonList;
    ArrayList<Pokemon> PokeList;
    MyAdapter adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_liste_pokemon, container, false);

        PokeList = new ArrayList<>();

        PokemonList  = (ListView)v.findViewById(R.id.listeViewPokeList);

        adapter = new MyAdapter(getActivity(), PokeList);
        PokemonList.setAdapter(adapter);

        if(PokemonApplication.getUser() != null)

        Manager_WS.getInstance().usersPokemon(PokemonApplication.getUser().getTokenFB(),PokeList,adapter);


        PokemonList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailPokemon.class);
                intent.putExtra("Pokemon", PokeList.get(i));
                startActivity(intent);
            }
        });
        return v;
    }





}
