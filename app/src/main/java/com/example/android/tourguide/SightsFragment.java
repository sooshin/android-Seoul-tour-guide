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

public class SightsFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sights, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.drawable.gyeongbokgung, getString(R.string.gyeongbokgung), "a"));
        attractions.add(new Attraction(R.drawable.bukchon_hanok_sakaori, getString(R.string.bukchon_hanok), "b"));
        attractions.add(new Attraction(R.drawable.changdukgung_choinjeong, getString(R.string.changdeokgung), "c"));
        attractions.add(new Attraction(R.drawable.seoul_tower, getString(R.string.n_seoul_tower), "d"));
        attractions.add(new Attraction(R.drawable.cheonggyecheon, getString(R.string.cheonggyecheon), "e"));
        attractions.add(new Attraction(R.drawable.war_memorial, getString(R.string.the_war_memorial), "f"));
        attractions.add(new Attraction(R.drawable.lotte_world_tower, getString(R.string.lotte_world_tower), "g"));
        attractions.add(new Attraction(R.drawable.bongeunsa_gael_chardon, getString(R.string.bongeunsa), "h"));
        attractions.add(new Attraction(R.drawable.insadong_leslie_pahang, getString(R.string.insadong), "i"));
        attractions.add(new Attraction(R.drawable.dongdaemun_design_plaza_nestor_lacle, getString(R.string.dongdaemun_design_plaza),"j"));
        attractions.add(new Attraction(R.drawable.hongik_uni_street_ken_eckert,getString(R.string.hongik_uni_street),"k"));


        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), attractions, R.layout.activity_main));

        return rootView;
    }
}
