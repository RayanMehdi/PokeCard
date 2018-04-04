package com.example.iem.pokecard.Model;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by iem on 10/11/2017.
 */

public class Pokemon implements Serializable {

    //Attributes


    public Pokemon(String icon, String name, int pv, int att, int def, int spA, int spD, int spe, int idPoke) {
        this.icon = icon;
        this.name = name;
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.spA = spA;
        this.spD = spD;
        this.spe = spe;
        this.idPoke = idPoke;
    }

    public  Pokemon(Pokemon pokemon){
        this.icon = pokemon.getIcon();
        this.name = pokemon.getName();
        this.pv = pokemon.getPv();
        this.att = pokemon.getAtt();
        this.def = pokemon.getDef();
        this.spA = pokemon.getSpA();
        this.spD = pokemon.getSpD();
        this.spe = pokemon.getSpe();
        this.idPoke = pokemon.getIdPoke();

    }

    String icon;
    String name;


    int pv, att, def, spA, spD, spe, idPoke;


    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public int getPv() {
        return pv;
    }

    public int getAtt() {
        return att;
    }

    public int getDef() {
        return def;
    }

    public int getSpA() {
        return spA;
    }

    public int getSpD() {
        return spD;
    }

    public int getSpe() {
        return spe;
    }


    public int getIdPoke() {
        return idPoke;
    }


    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSpA(int spA) {
        this.spA = spA;
    }

    public void setSpD(int spD) {
        this.spD = spD;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdPoke(int idPoke) {
        this.idPoke = idPoke;
    }
}
