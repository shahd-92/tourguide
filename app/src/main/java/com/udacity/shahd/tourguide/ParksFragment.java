package com.udacity.shahd.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by shahd on 4/8/17.
 */

public class ParksFragment extends Fragment {

    private ArrayList<Place> places;


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        //Create an array of words
        places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.kap), getResources().getString(R.string.kap_describtion),
                getResources().getString(R.string.kap_location), R.drawable.king_abdullah_park));
        places.add(new Place(getResources().getString(R.string.Wadi_Hanifah), getResources().getString(R.string.Wadi_Hanifah_describtion),
                getResources().getString(R.string.Wadi_Hanifah_location), R.drawable.wadi_hanifah));
        places.add(new Place(getResources().getString(R.string.old_diraiyah), getResources().getString(R.string.old_diraiyah_describtion),
                getResources().getString(R.string.old_diraiyah_location), R.drawable.old_diraiyah));
        places.add(new Place(getResources().getString(R.string.salam_park), getResources().getString(R.string.salam_park_describtion),
                getResources().getString(R.string.salam_park_location), R.drawable.salam_park));
        places.add(new Place(getResources().getString(R.string.bujairi), getResources().getString(R.string.bujairi_describtion),
                getResources().getString(R.string.bujairi_location), R.drawable.bujairi));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }
}