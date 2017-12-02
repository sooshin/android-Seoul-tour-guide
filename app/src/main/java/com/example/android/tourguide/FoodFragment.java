package com.example.android.tourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sj on 11/20/2017.
 */

public class FoodFragment extends Fragment{

    private List<Attraction> attractions;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        // Set up the RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        int numberOfColumns = 2;
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), numberOfColumns);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        // Create a list of attractions
        attractions = new ArrayList<>();

        // Add attractions to the list of attractions
        addAttractions();

        // Make the recyclerView use the RecyclerAdapter
        recyclerView.setAdapter(new FoodAdapter(getActivity(), attractions, R.layout.activity_main));
        return rootView;
    }

    /**
     * Add attractions to the list of attractions
     */
    public void addAttractions() {
        attractions.add(new Attraction(R.drawable.gwangjang,
                getString(R.string.gwangjang),
                getString(R.string.gwangjang_des),
                getString(R.string.gwangjang_address),
                getString(R.string.gwangjang_transport),
                getString(R.string.gwangjang_phone),
                getString(R.string.gwangjang_web),
                getString(R.string.gwangjang_hours),
                getString(R.string.gwangjang_fee)));
        attractions.add(new Attraction(R.drawable.hanilkwan,
                getString(R.string.hanilkwan),
                getString(R.string.hanilkwan_des),
                getString(R.string.hanilkwan_address),
                getString(R.string.hanilkwan_transport),
                getString(R.string.hanilkwan_phone),
                getString(R.string.hanilkwan_web),
                getString(R.string.hanilkwan_hours),
                getString(R.string.hanilkwan_fee)));
        attractions.add(new Attraction(R.drawable.tosokchon,
                getString(R.string.tosokchon),
                getString(R.string.tosokchon_des),
                getString(R.string.tosokchon_address),
                getString(R.string.tosokchon_transport),
                getString(R.string.tosokchon_phone),
                getString(R.string.tosokchon_web),
                getString(R.string.tosokchon_hours),
                getString(R.string.tosokchone_fee)));
        attractions.add(new Attraction(R.drawable.jokbal,
                getString(R.string.jokbal),
                getString(R.string.jokbal_des),
                getString(R.string.jokbal_address),
                getString(R.string.jokbal_transport),
                getString(R.string.jokbal_phone),
                getString(R.string.jokbal_web),
                getString(R.string.jokbal_hours),
                getString(R.string.jokbal_fee)));
        attractions.add(new Attraction(R.drawable.better_than_beef,
                getString(R.string.better_than_beef),
                getString(R.string.better_than_beef_des),
                getString(R.string.better_than_beef_address),
                getString(R.string.better_than_beef_transport),
                getString(R.string.better_than_beef_phone),
                getString(R.string.better_than_beef_hours),
                getString(R.string.better_than_beef_fee)));
        attractions.add(new Attraction(R.drawable.daedo,
                getString(R.string.daedo),
                getString(R.string.daedo_des),
                getString(R.string.daedo_address),
                getString(R.string.daedo_transport),
                getString(R.string.daedo_phone),
                getString(R.string.daedo_web),
                getString(R.string.daedo_hours),
                getString(R.string.daedo_fee)));



    }
}
