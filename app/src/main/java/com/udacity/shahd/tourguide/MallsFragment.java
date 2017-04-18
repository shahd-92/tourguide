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

public class MallsFragment extends Fragment {



        private ArrayList<Place> places;


        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.place_list, container, false);

            //Create an array of words
            places = new ArrayList<Place>();
            places.add(new Place(getResources().getString(R.string.kingdom_centre_tower), getResources().getString(R.string.kingdom_centre_tower_describtion),
                    getResources().getString(R.string.kingdom_centre_tower_location), R.drawable.kingdom_tower));

            places.add(new Place(getResources().getString(R.string.nakheel), getResources().getString(R.string.nakheel_describtion),
                    getResources().getString(R.string.nakheel_location), R.drawable.alnakheel_mall));

            places.add(new Place(getResources().getString(R.string.riyadh_gallery), getResources().getString(R.string.riyadh_gallery_describtion),
                    getResources().getString(R.string.riyadh_gallery_location), R.drawable.riyadh_gallery));

            places.add(new Place(getResources().getString(R.string.panorama), getResources().getString(R.string.panorama_describtion),
                    getResources().getString(R.string.panorama_location),
                    R.drawable.panorama_mall));

            PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }
}
