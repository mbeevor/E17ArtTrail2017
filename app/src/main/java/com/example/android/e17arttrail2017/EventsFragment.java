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
        events.add(new Listing(
                "PROCESS: PAPER MAKING AND PRINT MAKING",
                "Saturday, 3 June, 9.30am-12pm",
                "The Lodge, Walthamstow School For Girls, Church Hill",
                "Drop in to create your own paper and print. Explore and experiment with printmaking possibiliti es to create your own print to take away",
                R.drawable.e17logo300));

        events.add(new Listing("MARBLING AND SHAPE BUILDING WITH PLYCONIC",
                "Saturday, 3 June, 10am-1pm",
                "cafe @ Gnome House, 7 Blackhorse Lane",
                "Come and try this easy marbling, free workshop for kids. Hosted by local furniture maker Plyconic. Make your own piece of marbling art to take home. We will also have PlyShapes for kids to build mini sculptures with."

        ));

        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
