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
    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        //Create an array of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("National Museum", "It shows that history is only told from one view. The museum has a great flow from the beginning of time through to modern day.",
                "Al-Muraba - King Abdul Aziz Historical Center, Riyadh 11481, Saudi Arabia", R.drawable.national_museum));

        places.add(new Place("King Abdulaziz Historical Center", "About detailed history how and who and all where important people in development of middle East",
                "King Saud Street, Riyadh, Saudi Arabia", R.drawable.king_abdulaziz_historical));

        places.add(new Place("Saqer-Aljazirah Aviation Museum", "It's very well maintained and good collection of aircrafts.",
                "East Ring Road of Riyadh Between Exits 10 and 11 | Junction of Prince Abdullah Road & Service Road, Riyadh, Saudi Arabia", R.drawable.saqer_aljazirah_aviation));


        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
