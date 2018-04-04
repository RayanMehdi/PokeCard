package com.example.iem.pokecard.Model;

import java.util.ArrayList;

/**
 * Created by iem on 10/11/2017.
 */

public class User {

    String tokenFB, firstName, lastName;

    public User(String tokenFB, String firstName, String lastName) {
        this.tokenFB = tokenFB;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTokenFB() {
        return tokenFB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
