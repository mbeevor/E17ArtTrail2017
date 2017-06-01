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
        events.add(new Listing(R.string.event_title_one, R.string.event_date_one, R.string.event_address_one, R.string.event_description_one, R.drawable.e17logo300));
        events.add(new Listing(R.string.event_title_two, R.string.event_date_two, R.string.event_address_two, R.string.event_description_two, R.drawable.e17logo300));
        events.add(new Listing(R.string.event_title_three, R.string.event_date_three, R.string.event_address_three, R.string.event_description_three));
        events.add(new Listing(R.string.event_title_four, R.string.event_date_four, R.string.event_address_four, R.string.event_description_four));
        events.add(new Listing(R.string.event_title_five, R.string.event_date_five, R.string.event_address_five, R.string.event_description_five));
        events.add(new Listing(R.string.event_title_six, R.string.event_date_six, R.string.event_address_six, R.string.event_description_six));
        events.add(new Listing(R.string.event_title_seven, R.string.event_date_seven, R.string.event_address_seven, R.string.event_description_seven));
        events.add(new Listing(R.string.event_title_eight, R.string.event_date_eight, R.string.event_address_eight, R.string.event_description_eight));
        events.add(new Listing(R.string.event_title_nine, R.string.event_date_nine, R.string.event_address_nine, R.string.event_description_nine));
        events.add(new Listing(R.string.event_title_ten, R.string.event_date_ten, R.string.event_address_ten, R.string.event_description_ten));
        events.add(new Listing(R.string.event_title_eleven, R.string.event_date_eleven, R.string.event_address_eleven, R.string.event_description_eleven));
        events.add(new Listing(R.string.event_title_twelve, R.string.event_date_twelve, R.string.event_address_twelve, R.string.event_description_twelve));
        events.add(new Listing(R.string.event_title_thirteen, R.string.event_date_thirteen, R.string.event_address_thirteen, R.string.event_description_thirteen));
        events.add(new Listing(R.string.event_title_fourteen, R.string.event_date_fourteen, R.string.event_address_fourteen, R.string.event_description_fourteen));
        events.add(new Listing(R.string.event_title_fifteen, R.string.event_date_fifteen, R.string.event_address_fifteen, R.string.event_description_fifteen));
        events.add(new Listing(R.string.event_title_sixteen, R.string.event_date_sixteen, R.string.event_address_sixteen, R.string.event_description_sixteen));
        events.add(new Listing(R.string.event_title_seventeen, R.string.event_date_seventeen, R.string.event_address_seventeen, R.string.event_description_seventeen));
        events.add(new Listing(R.string.event_title_eighteen, R.string.event_date_eightteen, R.string.event_address_eighteen, R.string.event_description_eighteen));
        events.add(new Listing(R.string.event_title_nineteen, R.string.event_date_nineteen, R.string.event_address_nineteen, R.string.event_description_nineteen));
        events.add(new Listing(R.string.event_title_twenty, R.string.event_date_twenty, R.string.event_address_twenty, R.string.event_description_twenty));


        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
