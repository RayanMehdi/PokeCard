package com.example.iem.pokecard.Model;

import java.util.ArrayList;

/**
 * Created by iem on 11/12/2017.
 */

public class PokemonResponse {

    ArrayList<Pokemon> pokemons;
    String next, previous;

    public PokemonResponse() {
        pokemons = new ArrayList<Pokemon>();
        next = "";
        previous = "";
    }

    public PokemonResponse(ArrayList<Pokemon> pokemons, String next, String previous) {
        this.pokemons = pokemons;
        this.next = next;
        this.previous = previous;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
}
