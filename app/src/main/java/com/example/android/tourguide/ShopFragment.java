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
 * ShopFragment is a simple {@link Fragment} subclass and it represents where tourists can shop.
 */

public class ShopFragment extends Fragment {

    private List<Attraction> attractions;

    /** Predefined constants to manage background color and text color based on category */
    private static final int SHOP = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item, container, false);

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

        // Make the recyclerView use the ShopAdapter
        recyclerView.setAdapter(new ShopAdapter(getActivity(), attractions, SHOP));

        return rootView;
    }

    /**
     * Add attractions to the list of attractions
     */
    private void addAttractions() {
        attractions.add(new Attraction(R.drawable.myeongdong,
                getString(R.string.myeongdong),
                getString(R.string.myeongdong_des),
                getString(R.string.myeongdong_address),
                getString(R.string.myeongdong_transport),
                getString(R.string.myeongdong_hours)));
        attractions.add(new Attraction(R.drawable.namdaemun,
                getString(R.string.namdaemun),
                getString(R.string.namdaemun_des),
                getString(R.string.namdaemun_address),
                getString(R.string.namdaemun_transport),
                getString(R.string.namdaemun_hours)));
        attractions.add(new Attraction(R.drawable.goto_mall,
                getString(R.string.goto_mall),
                getString(R.string.goto_mall_des),
                getString(R.string.goto_mall_address),
                getString(R.string.goto_mall_transport),
                getString(R.string.goto_mall_hours)));
        attractions.add(new Attraction(R.drawable.dongdaemun,
                getString(R.string.dongdaemun),
                getString(R.string.dongdaemun_des),
                getString(R.string.dongdaemun_address),
                getString(R.string.dongdaemun_transport),
                getString(R.string.dongdaemun_hours)));
        attractions.add(new Attraction(R.drawable.common_ground,
                getString(R.string.common_ground),
                getString(R.string.common_ground_des),
                getString(R.string.common_ground_address),
                getString(R.string.common_ground_transport),
                getString(R.string.common_ground_hours)));
        attractions.add(new Attraction(R.drawable.garosugil,
                getString(R.string.garosu_gil),
                getString(R.string.garosu_gil_des),
                getString(R.string.garosu_gil_address),
                getString(R.string.garosu_gil_transport),
                getString(R.string.garosu_gil_hours)));
        attractions.add(new Attraction(R.drawable.times_square,
                getString(R.string.times_square),
                getString(R.string.times_square_des),
                getString(R.string.times_square_address),
                getString(R.string.times_square_transport),
                getString(R.string.times_square_hours)));

    }
}
