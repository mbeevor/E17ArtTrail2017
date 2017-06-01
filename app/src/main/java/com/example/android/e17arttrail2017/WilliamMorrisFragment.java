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
public class WilliamMorrisFragment extends Fragment {

    public WilliamMorrisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);


        // Create ArrayList for trail
        final ArrayList<Listing> events = new ArrayList<Listing>();
        events.add(new Listing(R.string.WM_title_one, R.string.WM_date_one, R.string.WM_address_one, R.string.WM_description_one));
        events.add(new Listing(R.string.WM_title_two, R.string.WM_date_two, R.string.WM_address_two, R.string.WM_description_two));
        events.add(new Listing(R.string.WM_title_three, R.string.WM_date_three, R.string.WM_address_three, R.string.WM_description_three));
        events.add(new Listing(R.string.WM_title_four, R.string.WM_date_four, R.string.WM_address_four, R.string.WM_description_four));
        events.add(new Listing(R.string.WM_title_five, R.string.WM_date_five, R.string.WM_address_five, R.string.WM_description_five));
        events.add(new Listing(R.string.WM_title_six, R.string.WM_date_six, R.string.WM_address_six, R.string.WM_description_six));
        events.add(new Listing(R.string.WM_title_seven, R.string.WM_date_seven, R.string.WM_address_seven, R.string.WM_description_seven));

        // attach ArrayList to adapter
        ListAdapter adapter = new ListAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
