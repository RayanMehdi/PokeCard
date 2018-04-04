package com.example.iem.pokecard.Manager;

import android.util.Log;

import com.example.iem.pokecard.Activity.DetailPokemon;
import com.example.iem.pokecard.Model.Pokemon;
import com.example.iem.pokecard.Model.User;
import com.example.iem.pokecard.MyAdapter;
import com.example.iem.pokecard.PokemonApplication;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by iem on 15/11/2017.
 */

public class Manager_WS {

    private static Manager_WS ourInstance = null;

    private Manager_WS() {
    }

    public static Manager_WS getInstance() {
        if(ourInstance == null) {
            ourInstance = new Manager_WS();
        }
        return ourInstance;
    }


    public void getList(final ArrayList<Pokemon> myList, final MyAdapter adapter)
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


    public void getPokemon(int pokemonId, final IGetPokemon listener)
    {
        Call<Pokemon> call = PokemonApplication.getServicePokemon().getPokemon(pokemonId);
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if(response.isSuccessful()) {
                    listener.success(response.body());
                } else {
                    listener.error();
                }
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Log.e("test", "error " + t.getMessage());
                listener.error();
            }
        });
    }

    public  void login(final String tokenFB, final String firstName, final String lastName){
        Call<User> call = PokemonApplication.getServicePokemon().login(tokenFB, firstName, lastName);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                PokemonApplication.setUser(new User(tokenFB,firstName,lastName));
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("test", "error " + t.getMessage());
            }
        });
    }

    public void usersPokemon(final  String tokenFB, final ArrayList<Pokemon> myList, final MyAdapter adapter){
        Call<ArrayList<Pokemon>> call = PokemonApplication.getServicePokemon().usersPokemon(tokenFB);
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

    public interface IGetPokemon {
        void success(Pokemon p);
        void error();
    }
}
