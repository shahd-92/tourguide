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

public class RestaurantsFragment  extends Fragment {

    private final String LOG_TAG = getClass().getName();
    private ArrayList<Place> places;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

//Create an array of words
        places = new ArrayList<Place>();
        places.add(new Place(getContext().getResources().getString(R.string.lusin), getContext().getResources().getString(R.string.lusin_describtion),
                getContext().getResources().getString(R.string.lusin_location), R.drawable.lusin));
        places.add(new Place(getContext().getResources().getString(R.string.nozomi), getContext().getResources().getString(R.string.nozomi_describtion),
                getContext().getResources().getString(R.string.nozomi_location), R.drawable.nozomi));
        places.add(new Place(getContext().getResources().getString(R.string.piatto), getContext().getResources().getString(R.string.piatto_describtion),
                getContext().getResources().getString(R.string.piatto_location), R.drawable.piatto));
        places.add(new Place(getContext().getResources().getString(R.string.alnajdiyah), getContext().getResources().getString(R.string.alnajdiyah_describtion),
                getContext().getResources().getString(R.string.alnajdiyah_location), R.drawable.alnajdiyah_village));
        places.add(new Place(getContext().getResources().getString(R.string.maharaja), getContext().getResources().getString(R.string.maharaja_describtion),
                getContext().getResources().getString(R.string.maharaja_location), R.drawable.maharaja_east));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }


}