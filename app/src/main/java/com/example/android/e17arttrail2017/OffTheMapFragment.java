package com.example.android.e17arttrail2017;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OffTheMapFragment extends Fragment {

    public OffTheMapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.event_list, container, false);

        // create ArrayList for Off the Trail
        final ArrayList<Listing> events = new ArrayList<Listing>();
        events.add(new Listing(R.string.OTM_title_one, R.string.OTM_date_one, R.string.OTM_address_one, R.string.OTM_description_one));
        events.add(new Listing(R.string.OTM_title_two, R.string.OTM_date_two, R.string.OTM_address_two, R.string.OTM_description_two));
        events.add(new Listing(R.string.OTM_title_three, R.string.OTM_date_three, R.string.OTM_address_three, R.string.OTM_description_three));
        events.add(new Listing(R.string.OTM_title_four, R.string.OTM_date_four, R.string.OTM_address_four, R.string.OTM_description_four));
        events.add(new Listing(R.string.OTM_title_five, R.string.OTM_date_five, R.string.OTM_address_five, R.string.OTM_description_five));
        events.add(new Listing(R.string.OTM_title_six, R.string.OTM_date_six, R.string.OTM_address_six, R.string.OTM_description_six));
        events.add(new Listing(R.string.OTM_title_seven, R.string.OTM_date_seven, R.string.OTM_address_seven, R.string.OTM_description_seven));

        // Attach ArrayList to adapter
        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}

