package com.example.android.tourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sj on 11/20/2017.
 */

public class NatureCultureFragment extends Fragment {

    private  List<Attraction> attractions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_natureculture, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        // Create a list of attractions
        attractions = new ArrayList<>();

        // Add attractions to the list of attractions
        addAttractions();

        // Make the recyclerView use the RecyclerAdapter
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), attractions, R.layout.activity_main));

        return rootView;
    }

    /**
     * Add attractions to the list of attractions
     */
    public void addAttractions() {
        attractions.add(new Attraction(R.drawable.dmz, getString(R.string.dmz),
                getString(R.string.dmz_des), getString(R.string.dmz_address),
                getString(R.string.dmz_transport)));
        attractions.add(new Attraction(R.drawable.bukhansan, getString(R.string.bukhansan),
                getString(R.string.bukhansan_des), getString(R.string.bukhansan_address),
                getString(R.string.bukhansan_transport), getString(R.string.bukhansan_phone),
                getString(R.string.bukhansan_web), getString(R.string.bukhansan_hours),
                getString(R.string.bukhansan_fee)));
        attractions.add(new Attraction(R.drawable.national_museum_of_korea,
                getString(R.string.national_museum), getString(R.string.national_museum_des),
                getString(R.string.national_museum_address),
                getString(R.string.national_museum_transport),
                getString(R.string.national_museum_phone), getString(R.string.national_museum_web),
                getString(R.string.national_museum_hours), getString(R.string.national_museum_fee)));
        attractions.add(new Attraction(R.drawable.yeouido_hangang_park,
                getString(R.string.hangang_park), getString(R.string.hangang_park_des),
                getString(R.string.hangang_park_address), getString(R.string.hangang_park_transport),
                getString(R.string.hangang_park_phone), getString(R.string.hangang_park_web),
                getString(R.string.hangang_park_hours), getString(R.string.hangang_park_fee)));
        attractions.add(new Attraction(R.drawable.grevin_museum,
                getString(R.string.grevin_museum), getString(R.string.grevin_museum_des),
                getString(R.string.grevin_museum_address), getString(R.string.grevin_museum_transport),
                getString(R.string.grevin_museum_phone), getString(R.string.grevin_museum_web),
                getString(R.string.grevin_museum_hours), getString(R.string.grevin_museum_fee)));
        attractions.add(new Attraction(R.drawable.trick_eye_museum,
                getString(R.string.trickeye_museum), getString(R.string.trickeye_museum_des),
                getString(R.string.trickeye_museum_address), getString(R.string.trickeye_museum_transport),
                getString(R.string.trickeye_museum_phone), getString(R.string.trickeye_museum_web),
                getString(R.string.trickeye_museum_hours), getString(R.string.trickeye_museum_fee)));
        attractions.add(new Attraction(R.drawable.olympic_park,
                getString(R.string.olympic_park), getString(R.string.olympic_park_des),
                getString(R.string.olympic_park_address), getString(R.string.olympic_park_transport),
                getString(R.string.olympic_park_phone), getString(R.string.olympic_park_web),
                getString(R.string.olympic_park_hours), getString(R.string.olympic_park_fee)));
        attractions.add(new Attraction(R.drawable.jamsil_baseball,
                getString(R.string.jamsil_baseball), getString(R.string.jamsil_baseball_des),
                getString(R.string.jamsil_baseball_address), getString(R.string.jamsil_baseball_transport),
                getString(R.string.jamsil_baseball_phone), getString(R.string.jamsil_baseball_web),
                getString(R.string.jamsil_baseball_hours), getString(R.string.jamsil_baseball_fee)));
        attractions.add(new Attraction(R.drawable.national_folk_museum,
                getString(R.string.national_folk_museum), getString(R.string.national_folk_museum_des),
                getString(R.string.national_folk_museum_address), getString(R.string.national_folk_museum_transport),
                getString(R.string.national_folk_museum_phone), getString(R.string.national_folk_museum_web),
                getString(R.string.national_folk_museum_hours), getString(R.string.national_folk_museum_fee)));
        attractions.add(new Attraction(R.drawable.leeum,
                getString(R.string.leeum), getString(R.string.leeum_des),
                getString(R.string.leeum_address), getString(R.string.leeum_transport),
                getString(R.string.leeum_phone), getString(R.string.leeum_web),
                getString(R.string.leeum_hours), getString(R.string.leeum_fee)));
        attractions.add(new Attraction(R.drawable.coex_aquarium,
                getString(R.string.coex_aquarium), getString(R.string.coex_aquarium_des),
                getString(R.string.coex_aquarium_address), getString(R.string.coex_aquarium_transport),
                getString(R.string.coex_aquarium_phone), getString(R.string.coex_aquarium_web),
                getString(R.string.coex_aquarium_hours), getString(R.string.coex_aquarium_fee)));
        attractions.add(new Attraction(R.drawable.siloam_spa,
                getString(R.string.spa), getString(R.string.spa_des),
                getString(R.string.spa_address), getString(R.string.spa_transport),
                getString(R.string.spa_phone), getString(R.string.spa_web),
                getString(R.string.spa_hours), getString(R.string.spa_fee)));
    }

}
