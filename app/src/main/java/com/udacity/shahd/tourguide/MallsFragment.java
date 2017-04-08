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
    public MallsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        //Create an array of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Kingdom Centre Tower", "It is the tallest tower in Saudi Arabia.",
                " King Fahad Road, Riyadh, Saudi Arabia", R.drawable.kingdom_tower));

        places.add(new Place("Al Nakheel Mall", "There is many large shops for brands. And there is many cafes",
                "2976 Al Al Imam Saud Ibn Abdul Aziz Branch Road | Al Mughrizat, Riyadh 124856121, Saudi Arabia", R.drawable.alnakheel_mall));

        places.add(new Place("Riyadh Gallery Mall", "In this mall you can find most popular stores around",
                "King Fahd Road | 24. 743892, 46. 657829, Riyadh, Saudi Arabia", R.drawable.riyadh_gallery));

        places.add(new Place("Panorama Mall","Consider one of good choice even daily visit they have many Brand’s shops , cafe,resturant's and kids area",
                "Takhassusi | Al Ma'thar Ash Shamali, Riyadh 12332, Saudi Arabia",
                 R.drawable.panorama_mall));


        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, places, R.color.category_resturants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;

    }
}
