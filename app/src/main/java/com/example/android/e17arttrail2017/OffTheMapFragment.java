package com.example.android.e17arttrail2017;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class OffTheMapFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(),"Off the Map clicked", Toast.LENGTH_SHORT).show();
    }

    public OffTheMapFragment() {
        // Required empty public constructor
    }
}

