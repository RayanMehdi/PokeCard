package com.example.iem.pokecard.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iem.pokecard.R;

/**
 * Created by alexandre on 04/04/2018.
 */

public class MyListFragment extends Fragment {
    public MyListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v;
        v = inflater.inflate(R.layout.fragment_my_list, container, false);
        // Inflate the layout for this fragment
        return v;
    }






}
