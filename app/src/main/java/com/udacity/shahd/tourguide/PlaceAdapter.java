package com.udacity.shahd.tourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shahd on 4/8/17.
 */

class PlaceAdapter extends ArrayAdapter<Place> {
    private int mColorResourceId;

    public PlaceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Place> words, int colorResourceId) {
        super(context, resource, words);
        mColorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace= getItem(position);

        TextView titleTextView=(TextView) listItemView.findViewById(R.id.title);
        TextView descriptionTextView=(TextView) listItemView.findViewById(R.id.description);
        TextView addressTextView=(TextView) listItemView.findViewById(R.id.address);
        ImageView resourceIdImageId = (ImageView)  listItemView.findViewById(R.id.placeImage);
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        titleTextView.setText(currentPlace.getmTitle());
        descriptionTextView.setText(currentPlace.getmDescribtion());
        addressTextView.setText(currentPlace.getmAddress());
        textContainer.setBackgroundColor(color);
        resourceIdImageId.setImageResource(currentPlace.getmImageResourceId());

        return listItemView;
    }
}
