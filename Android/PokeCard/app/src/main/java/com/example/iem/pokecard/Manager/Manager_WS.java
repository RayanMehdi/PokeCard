package com.example.iem.pokecard.Manager;

import android.util.Log;
import android.widget.Adapter;

import com.example.iem.pokecard.Model.Pokemon;
import com.example.iem.pokecard.Model.PokemonResponse;
import com.example.iem.pokecard.MyAdapter;
import com.example.iem.pokecard.PokemonApplication;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by iem on 15/11/2017.
 */

public class Manager_WS {

    ArrayList<Pokemon> myList;
    MyAdapter adapter;
    PokemonResponse pokemonResponse;

    public Manager_WS(ArrayList<Pokemon> myList, MyAdapter adapter, PokemonResponse pokemonResponse) {
        this.myList = myList;
        this.adapter = adapter;
        this.pokemonResponse = pokemonResponse;
    }

    public void getList()
    {
        Call<ArrayList<Pokemon>> call = PokemonApplication.getServicePokemon().getAll();
        call.enqueue(new Callback<ArrayList<Pokemon>>() {
            @Override
            public void onResponse(Call<ArrayList<Pokemon>> call, Response<ArrayList<Pokemon>> response) {
                myList.addAll(response.body());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ArrayList<Pokemon>> call, Throwable t) {
                Log.e("test", "error");

            }
        });
    }

    public void getPokemons()
    {
        Call<PokemonResponse> call = PokemonApplication.getServicePokemon().getPokemons();
        call.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                pokemonResponse.setPokemons(response.body().getPokemons());
                pokemonResponse.setNext(response.body().getNext());
                pokemonResponse.setPrevious(response.body().getPrevious());
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                Log.e("test", "error");
            }
        });
    }

}
