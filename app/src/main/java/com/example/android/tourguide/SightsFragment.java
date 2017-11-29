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

    private List<Attraction> attractions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sights, container, false);

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
        attractions.add(new Attraction(R.drawable.gyeongbokgung, getString(R.string.gyeongbokgung), getString(R.string.gyeongbokgung_short),
                getString(R.string.gyeongbokgung_des), getString(R.string.gyeongbokgung_address),
                getString(R.string.gyeongbokgung_transport), getString(R.string.gyeongbokgung_phone),
                getString(R.string.gyeongbokgung_web), getString(R.string.gyeongbokgung_hours),
                getString(R.string.gyeongbokgung_fee)));
        attractions.add(new Attraction(R.drawable.bukchon_hanok, getString(R.string.bukchon_hanok), getString(R.string.bukchon_hanok_short),
                getString(R.string.bukchon_hanok_des), getString(R.string.bukchon_hanok_address),
                getString(R.string.bukchon_hanok_transport), getString(R.string.bukchon_hanok_phone),
                getString(R.string.bukchon_hanok_web), getString(R.string.bukchon_hanok_hours),
                getString(R.string.bukchon_hanok_fee)));
        attractions.add(new Attraction(R.drawable.changdeokgung, getString(R.string.changdeokgung), getString(R.string.changdeokgung_short),
                getString(R.string.changdeokgung_des), getString(R.string.changdeokgung_address),
                getString(R.string.changdeokgung_transport), getString(R.string.changdeokgung_phone),
                getString(R.string.changdeokgung_web), getString(R.string.changdeokgung_hours),
                getString(R.string.changdeokgung_fee)));
        attractions.add(new Attraction(R.drawable.seoul_tower, getString(R.string.n_seoul_tower), getString(R.string.n_seoul_tower_short),
                getString(R.string.n_seoul_tower_des), getString(R.string.n_seoul_tower_address),
                getString(R.string.n_seoul_tower_transport), getString(R.string.n_seoul_tower_phone),
                getString(R.string.n_seoul_tower_web), getString(R.string.n_seoul_tower_hours),
                getString(R.string.n_seoul_tower_fee)));
        attractions.add(new Attraction(R.drawable.cheonggyecheon, getString(R.string.cheonggyecheon), getString(R.string.cheonggyecheon_short),
                getString(R.string.cheonggyecheon_des), getString(R.string.cheonggyecheon_address),
                getString(R.string.cheonggyecheon_transport), getString(R.string.cheonggyecheon_phone),
                getString(R.string.cheonggyecheon_web), getString(R.string.cheonggyecheon_hours),
                getString(R.string.cheonggyecheon_fee)));
        attractions.add(new Attraction(R.drawable.war_memorial, getString(R.string.war_memorial), getString(R.string.war_memorial_short),
                getString(R.string.war_memorial_des), getString(R.string.war_memorial_address),
                getString(R.string.war_memorial_transport), getString(R.string.war_memorial_phone),
                getString(R.string.war_memorial_web), getString(R.string.war_memorial_hours),
                getString(R.string.war_memorial_fee)));
        attractions.add(new Attraction(R.drawable.lotte_world_tower, getString(R.string.lotte_world_tower), getString(R.string.lotte_world_tower_short),
                getString(R.string.lotte_world_tower_des), getString(R.string.lotte_world_tower_address),
                getString(R.string.lotte_world_tower_transport), getString(R.string.lotte_world_tower_phone),
                getString(R.string.lotte_world_tower_web), getString(R.string.lotte_world_tower_hours),
                getString(R.string.lotte_world_tower_fee)));
        attractions.add(new Attraction(R.drawable.bongeunsa_gael_chardon, getString(R.string.bongeunsa), getString(R.string.bongeunsa_short),
                getString(R.string.bongeunsa_des), getString(R.string.bongeunsa_address),
                getString(R.string.bongeunsa_transport), getString(R.string.bongeunsa_phone),
                getString(R.string.bongeunsa_web), getString(R.string.bongeunsa_hours),
                getString(R.string.bongeunsa_fee)));
        attractions.add(new Attraction(R.drawable.insadong, getString(R.string.insadong), getString(R.string.insadong_short),
                getString(R.string.insadong_des), getString(R.string.insadong_address),
                getString(R.string.insadong_transport), getString(R.string.insadong_phone),
                getString(R.string.insadong_web), getString(R.string.insadong_hours),
                getString(R.string.insadong_fee)));
        attractions.add(new Attraction(R.drawable.ddp, getString(R.string.ddp), getString(R.string.ddp_short),
                getString(R.string.ddp_des), getString(R.string.ddp_address),
                getString(R.string.ddp_transport), getString(R.string.ddp_phone),
                getString(R.string.ddp_web), getString(R.string.ddp_hours),
                getString(R.string.ddp_fee)));
        attractions.add(new Attraction(R.drawable.hongik_uni_street,
                getString(R.string.hongik_uni_street), getString(R.string.hongik_uni_street_short),
                getString(R.string.hongik_uni_street_des),
                getString(R.string.hongik_uni_street_address),
                getString(R.string.hongik_uni_street_transport)));
        attractions.add(new Attraction(R.drawable.jongmyo_shrine, getString(R.string.jongmyo), getString(R.string.jongmyo_short),
                getString(R.string.jongmyo_des), getString(R.string.jongmyo_address),
                getString(R.string.jongmyo_transport), getString(R.string.jongmyo_phone),
                getString(R.string.jongmyo_web), getString(R.string.jongmyo_hours), getString(R.string.jongmyo_fee)));
    }
}
