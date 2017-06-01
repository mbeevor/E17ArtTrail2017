package com.example.android.e17arttrail2017;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapter for creating each individual list item
 */

public class ListAdapter extends ArrayAdapter<Listing> {

    public ListAdapter(Context context, ArrayList<Listing> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list_item, parent, false);
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
        // check boolean in 'Listing' to determine if space needed to display image
        if (Listing.hasImage()) {
            eventImage.setImageResource(Listing.getEventImage());
            eventImage.setVisibility(View.VISIBLE);
        } else {
            eventImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
