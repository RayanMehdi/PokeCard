package com.example.iem.pokecard.Model;

import java.util.ArrayList;

/**
 * Created by iem on 10/11/2017.
 */

public class User {


    private static final User instance = new User();

    public static User getInstance() {
        return instance;
    }


    String tokenFB, firstName, lastName;

}
