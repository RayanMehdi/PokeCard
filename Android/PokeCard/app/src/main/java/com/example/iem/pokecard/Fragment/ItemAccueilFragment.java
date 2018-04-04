package com.example.iem.pokecard.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iem.pokecard.R;

/**
 * Created by alexandre on 28/03/2018.
 */

public class ItemAccueilFragment extends Fragment {
    public ItemAccueilFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v;
        v = inflater.inflate(R.layout.fragment_content_main, container, false);
        // Inflate the layout for this fragment
        return v;
    }
}
