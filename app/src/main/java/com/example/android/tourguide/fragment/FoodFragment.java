package com.example.android.tourguide.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.object.Food;
import com.example.android.tourguide.adapter.FoodAdapter;
import com.example.android.tourguide.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass
 */

public class FoodFragment extends Fragment{

    private List<Food> foods;

    /** Predefined constants to manage background color and text color based on category */
    private static final int FOOD = 4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item, container, false);

        // Set title
        getActivity().setTitle(getString(R.string.food));

        // Set up the RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        int numberOfColumns = 2;
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), numberOfColumns);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        // Create a list of foods
        foods = new ArrayList<>();

        // Add foods to the list of foods
        addFoods();

        // Make the recyclerView use the RecyclerAdapter
        recyclerView.setAdapter(new FoodAdapter(getActivity(), foods, FOOD));
        return rootView;
    }

    /**
     * Add foods to the list of foods
     */
    private void addFoods() {
        foods.add(new Food(R.drawable.gwangjang,
                getString(R.string.gwangjang),
                getString(R.string.gwangjang_des),
                getString(R.string.gwangjang_address),
                getString(R.string.gwangjang_transport),
                getString(R.string.gwangjang_phone),
                getString(R.string.gwangjang_web),
                getString(R.string.gwangjang_hours),
                getString(R.string.gwangjang_fee)));
        foods.add(new Food(R.drawable.hanilkwan,
                getString(R.string.hanilkwan),
                getString(R.string.hanilkwan_des),
                getString(R.string.hanilkwan_address),
                getString(R.string.hanilkwan_transport),
                getString(R.string.hanilkwan_phone),
                getString(R.string.hanilkwan_web),
                getString(R.string.hanilkwan_hours),
                getString(R.string.hanilkwan_fee)));
        foods.add(new Food(R.drawable.tosokchon,
                getString(R.string.tosokchon),
                getString(R.string.tosokchon_des),
                getString(R.string.tosokchon_address),
                getString(R.string.tosokchon_transport),
                getString(R.string.tosokchon_phone),
                getString(R.string.tosokchon_web),
                getString(R.string.tosokchon_hours),
                getString(R.string.tosokchone_fee)));
        foods.add(new Food(R.drawable.jokbal,
                getString(R.string.jokbal),
                getString(R.string.jokbal_des),
                getString(R.string.jokbal_address),
                getString(R.string.jokbal_transport),
                getString(R.string.jokbal_phone),
                getString(R.string.jokbal_web),
                getString(R.string.jokbal_hours),
                getString(R.string.jokbal_fee)));
        foods.add(new Food(R.drawable.better_than_beef,
                getString(R.string.better_than_beef),
                getString(R.string.better_than_beef_des),
                getString(R.string.better_than_beef_address),
                getString(R.string.better_than_beef_transport),
                getString(R.string.better_than_beef_phone),
                getString(R.string.better_than_beef_hours),
                getString(R.string.better_than_beef_fee)));
        foods.add(new Food(R.drawable.daedo,
                getString(R.string.daedo),
                getString(R.string.daedo_des),
                getString(R.string.daedo_address),
                getString(R.string.daedo_transport),
                getString(R.string.daedo_phone),
                getString(R.string.daedo_web),
                getString(R.string.daedo_hours),
                getString(R.string.daedo_fee)));
        foods.add(new Food(R.drawable.chicken,
                getString(R.string.chicken),
                getString(R.string.chicken_des),
                getString(R.string.chicken_phone),
                getString(R.string.chicken_web),
                getString(R.string.chicken_hours),
                getString(R.string.chicken_fee)));
        foods.add(new Food(R.drawable.jungsik,
                getString(R.string.jungsik),
                getString(R.string.jungsik_des),
                getString(R.string.jungsik_address),
                getString(R.string.jungsik_transport),
                getString(R.string.jungsik_phone),
                getString(R.string.jungsik_web),
                getString(R.string.jungsik_hours),
                getString(R.string.jungsik_fee)));
        foods.add(new Food(R.drawable.beef_sarang,
                getString(R.string.beef_sarang),
                getString(R.string.beef_sarang_des),
                getString(R.string.beef_sarang_address),
                getString(R.string.beef_sarang_transport),
                getString(R.string.beef_sarang_phone),
                getString(R.string.beef_sarang_web),
                getString(R.string.beef_sarang_hours),
                getString(R.string.beef_sarang_fee)));
        foods.add(new Food(getString(R.string.bamdokkaebi),
                R.drawable.bamdokkaebi,
                getString(R.string.bamdokkaebi_des),
                getString(R.string.bamdokkaebi_address),
                getString(R.string.bamdokkaebi_transport),
                getString(R.string.bamdokkaebi_web),
                getString(R.string.bamdokkaebi_hours),
                getString(R.string.bamdokkaebi_fee)));

    }
}
