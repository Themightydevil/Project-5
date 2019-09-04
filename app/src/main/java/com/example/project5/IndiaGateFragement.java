package com.example.project5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IndiaGateFragement extends Fragment {


    public IndiaGateFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create an array of content

        ArrayList<Tour> content = new ArrayList<>();
        ListView listView = rootView.findViewById(R.id.rootView);

        content.add(new Tour(getString(R.string.india_gate_info), getString(R.string.india_gate_hours),
                getString(R.string.india_gate_fees), R.drawable.india_gate));

        TourAdapter itemsAdapter = new TourAdapter(getActivity(), content);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
