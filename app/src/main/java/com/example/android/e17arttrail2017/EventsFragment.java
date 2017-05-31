package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

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
        events.add(new Listing("Process Paper Making and Print Making", "The Lodge Walthamstow School for Girls", "Saturday 3 June 9 until 12pm", "Drop in to create your own paper and print", R.drawable.e17logo300));

        ListingAdapter adapter = new ListingAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
