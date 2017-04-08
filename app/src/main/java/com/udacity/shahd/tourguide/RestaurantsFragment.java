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

    String LOG_TAG = getClass().getName();

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        //Create an array of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Lusin", "Lusin serves its guests enticing Armenian specialities renowned for its distinctive aromas and flavourful preparations. " ,
                "Olaya St | 2nd floor intersection with Tahlya St, Riyadh, Saudi Arabia", R.drawable.lusin));
        places.add(new Place("Nozomi", "Nozomi brings an exciting and unique dining experience from Knightsbridge, London to the heart of Riyadh.",
                "Dabbab Street, Riyadh 12223, Saudi Arabia", R.drawable.nozomi));
        places.add(new Place("Piatto", "One of the best Italian restaurants and great atmosphere. ",
                "North Ring Road | Exit 5 Opp Tala Mall, Riyadh 301741, Saudi Arabia", R.drawable.piatto));
        places.add(new Place("Al-Najdiyah Village", "The restaurant was built to represent an old traditional mud house, which was the traditional way in Najd area years ago.",
                "AboBakr AlSiddeeq Street | Al Nuzhah Area, Riyadh 11464, Saudi Arabia", R.drawable.alnajdiyah_village));
        places.add(new Place("Maharaja East by Vineet", "The most authentic Indian Resturant in Riyadh ",
                "8468 King Muhammad V, As Sulimaniyah, Riyadh 12223, Saudi Arabia", R.drawable.maharaja_east));


        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }


}