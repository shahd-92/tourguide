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

public class MuseumsFragment extends Fragment {
    private ArrayList<Place> places;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        //Create an array of words
        places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.national_museum), getResources().getString(R.string.national_museum_describtion), getResources().getString(R.string.national_museum_location), R.drawable.national_museum));

        places.add(new Place(getResources().getString(R.string.kahc), getResources().getString(R.string.kahc_describtion),
                getResources().getString(R.string.kahc_location), R.drawable.king_abdulaziz_historical));

        places.add(new Place(getResources().getString(R.string.saqer), getResources().getString(R.string.saqer_describtion),
                getResources().getString(R.string.saqer_location), R.drawable.saqer_aljazirah_aviation));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
