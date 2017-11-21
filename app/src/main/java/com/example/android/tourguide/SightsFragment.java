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

        attractions.add(new Attraction(R.drawable.taejongdae, getString(R.string.taejongdae), getString(R.string.taejongdae_des)));
        attractions.add(new Attraction(R.drawable.haedong_yonggung, getString(R.string.haedong_yonggung), "b"));
        attractions.add(new Attraction(R.drawable.haeundae, getString(R.string.haeundae), "c"));
        attractions.add(new Attraction(R.drawable.gwangandaegyo_spaid, getString(R.string.gwangandaegyo), "d"));
        attractions.add(new Attraction(R.drawable.beomeosa, getString(R.string.beomeosa), "e"));
        attractions.add(new Attraction(R.drawable.gamcheon, getString(R.string.gamcheon), "f"));
        attractions.add(new Attraction(R.drawable.oryukdo, getString(R.string.oryukdo), "g"));
        attractions.add(new Attraction(R.drawable.hwangnyeongsan, getString(R.string.hwangnyeongsan), "h"));
        attractions.add(new Attraction(R.drawable.songdo_cablecar, getString(R.string.songdo), "i"));
        attractions.add(new Attraction(R.drawable.cheongsapo_spaid, getString(R.string.cheongsapo), "j"));

        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), attractions, R.layout.activity_main));

        return rootView;
    }
}
