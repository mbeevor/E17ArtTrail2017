package com.example.android.e17arttrail2017;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter for creating each individual list item
 */

public class ListingAdapter extends ArrayAdapter<Listing> {

    public ListingAdapter(Context context, ArrayList<Listing> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_list, parent, false);
        }

        Listing Listing = getItem(position);

        TextView eventTitle = (TextView) listItemView.findViewById(R.id.list_heading);
        eventTitle.setText(Listing.getEventName());

        TextView eventDate = (TextView) listItemView.findViewById(R.id.date);
        eventDate.setText(Listing.getEventDate());

        TextView eventAddress = (TextView) listItemView.findViewById(R.id.address);
        eventAddress.setText(Listing.getEventLocation());

        TextView eventDescription = (TextView) listItemView.findViewById(R.id.description);
        eventDescription.setText(Listing.getEventDescription());

        ImageView eventImage = (ImageView) listItemView.findViewById(R.id.image);
        eventImage.setImageResource(Listing.getEventImage());

        return listItemView;
    }
}
