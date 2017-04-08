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
    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        //Create an array of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("King Abdullah Park", "Nice place for relaxation with the family especially on weekends",
                "Al Amin Abdullah Al Ali Al Naeem, Riyadh, Saudi Arabia", R.drawable.king_abdullah_park));
        places.add(new Place("Wadi Hanifah", "Its quite attractive place placed beside with DAM which usually fill with rain water",
                "West of Al Diriyah, Riyadh, Saudi Arabia", R.drawable.wadi_hanifah));
        places.add(new Place("Old Dir'aiyah", "A great place to wander around and get a taste of the old Riyadh. ",
                "Thumeiry Street, Riyadh, Saudi Arabia", R.drawable.old_diraiyah));
        places.add(new Place("Salam Park", "The biggest park in Riyadh. Contains a big lake and a lot of playing and seatings areas. ",
                "Riyadh 12651, Saudi Arabia", R.drawable.salam_park));
        places.add(new Place("Al Bujairi square", "It's a wonderfully set up area a the far North-West of Riyadh.",
                "King Faisal Rd, Riyadh, Saudi Arabia", R.drawable.bujairi));


        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }
}
