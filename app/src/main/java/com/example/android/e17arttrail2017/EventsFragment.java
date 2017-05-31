package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/*
* Fragment for displaying all events from the event calendar
*
*/

public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);

        final ArrayList<Listing> events = new ArrayList<Listing>();
        events.add(new Listing(R.string.event_title_one, R.string.event_date_one, R.string.event_address_one, R.string.event_description_one, R.drawable.event_image_one));
        events.add(new Listing(R.string.event_title_two, R.string.event_date_two, R.string.event_address_two, R.string.event_description_two));

        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
