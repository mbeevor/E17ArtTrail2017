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
        events.add(new Listing(R.string.event_title_two, R.string.event_date_two, R.string.event_address_two, R.string.event_description_two, R.drawable.event_image_two));
        events.add(new Listing(R.string.event_title_three, R.string.event_date_three, R.string.event_address_three, R.string.event_description_three, R.drawable.event_image_three));
        events.add(new Listing(R.string.event_title_four, R.string.event_date_four, R.string.event_address_four, R.string.event_description_four, R.drawable.event_image_four));
        events.add(new Listing(R.string.event_title_five, R.string.event_date_five, R.string.event_address_five, R.string.event_description_five, R.drawable.event_image_five));
        events.add(new Listing(R.string.event_title_six, R.string.event_date_six, R.string.event_address_six, R.string.event_description_six));
        events.add(new Listing(R.string.event_title_seven, R.string.event_date_seven, R.string.event_address_seven, R.string.event_description_seven, R.drawable.event_image_seven));
        events.add(new Listing(R.string.event_title_eight, R.string.event_date_eight, R.string.event_address_eight, R.string.event_description_eight));
        events.add(new Listing(R.string.event_title_nine, R.string.event_date_nine, R.string.event_address_nine, R.string.event_description_nine));
        events.add(new Listing(R.string.event_title_ten, R.string.event_date_ten, R.string.event_address_ten, R.string.event_description_ten, R.drawable.event_image_ten));
        events.add(new Listing(R.string.event_title_eleven, R.string.event_date_eleven, R.string.event_address_eleven, R.string.event_description_eleven));
        events.add(new Listing(R.string.event_title_twelve, R.string.event_date_twelve, R.string.event_address_twelve, R.string.event_description_twelve, R.drawable.event_image_twelve));
        events.add(new Listing(R.string.event_title_thirteen, R.string.event_date_thirteen, R.string.event_address_thirteen, R.string.event_description_thirteen));
        events.add(new Listing(R.string.event_title_fourteen, R.string.event_date_fourteen, R.string.event_address_fourteen, R.string.event_description_fourteen, R.drawable.event_image_fourteen));
        events.add(new Listing(R.string.event_title_fifteen, R.string.event_date_fifteen, R.string.event_address_fifteen, R.string.event_description_fifteen));
        events.add(new Listing(R.string.event_title_sixteen, R.string.event_date_sixteen, R.string.event_address_sixteen, R.string.event_description_sixteen));
        events.add(new Listing(R.string.event_title_seventeen, R.string.event_date_seventeen, R.string.event_address_seventeen, R.string.event_description_seventeen));
        events.add(new Listing(R.string.event_title_eighteen, R.string.event_date_eighteen, R.string.event_address_eighteen, R.string.event_description_eighteen));
        events.add(new Listing(R.string.event_title_nineteen, R.string.event_date_nineteen, R.string.event_address_nineteen, R.string.event_description_nineteen));
        events.add(new Listing(R.string.event_title_twenty, R.string.event_date_twenty, R.string.event_address_twenty, R.string.event_description_twenty, R.drawable.event_image_twenty));
        events.add(new Listing(R.string.event_title_twenty_one, R.string.event_date_twenty_one, R.string.event_address_twenty_one, R.string.event_description_twenty_one));
        events.add(new Listing(R.string.event_title_twenty_two, R.string.event_date_twenty_two, R.string.event_address_twenty_two, R.string.event_description_twenty_two, R.drawable.event_image_twenty_two));
        events.add(new Listing(R.string.event_title_twenty_three, R.string.event_date_twenty_three, R.string.event_address_twenty_three, R.string.event_description_twenty_three, R.drawable.event_image_twenty_three));
        events.add(new Listing(R.string.event_title_twenty_four, R.string.event_date_twenty_four, R.string.event_address_twenty_four, R.string.event_description_twenty_four, R.drawable.event_image_twenty_four));
        events.add(new Listing(R.string.event_title_twenty_five, R.string.event_date_twenty_five, R.string.event_address_twenty_five, R.string.event_description_twenty_five, R.drawable.event_image_twenty_five));
        events.add(new Listing(R.string.event_title_twenty_six, R.string.event_date_twenty_six, R.string.event_address_twenty_six, R.string.event_description_twenty_six));
        events.add(new Listing(R.string.event_title_twenty_seven, R.string.event_date_twenty_seven, R.string.event_address_twenty_seven, R.string.event_description_twenty_seven, R.drawable.event_image_twenty_seven));
        events.add(new Listing(R.string.event_title_twenty_eight, R.string.event_date_twenty_eight, R.string.event_address_twenty_eight, R.string.event_description_twenty_eight));
        events.add(new Listing(R.string.event_title_twenty_nine, R.string.event_date_twenty_nine, R.string.event_address_twenty_nine, R.string.event_description_twenty_nine, R.drawable.event_image_twenty_nine));
        events.add(new Listing(R.string.event_title_thirty, R.string.event_date_thirty, R.string.event_address_thirty, R.string.event_description_thirty));

        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
