package com.example.iem.pokecard.Service;

import com.example.iem.pokecard.Model.Pokemon;
import com.example.iem.pokecard.Model.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by iem on 15/11/2017.
 */

public interface ServicePokemon {

    @GET("list")
    Call<ArrayList<Pokemon>> getAll();

    @GET("pokemon/{pokemonId}")
    Call<Pokemon> getPokemon(@Path("pokemonId") int pokemonId);

    @POST("login")
    @FormUrlEncoded
    Call<User> login(@Field("tokenFB") String tokenFB, @Field("firstName") String firstName, @Field("lastName") String lastName);

    @GET("usersPokemon/{tokenFB}")
    Call<ArrayList<Pokemon>> usersPokemon(@Path("tokenFB") String tokenFB);


}
