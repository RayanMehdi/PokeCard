package com.example.iem.pokecard.Service;

import com.example.iem.pokecard.Model.Pokemon;
import com.example.iem.pokecard.Model.PokemonResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by iem on 15/11/2017.
 */

public interface ServicePokemon {

    @GET("list")
    Call<ArrayList<Pokemon>> getAll();

    @GET("getPokemons")
    Call<PokemonResponse> getPokemons();
}
