package com.example.android.e17arttrail2017;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(),"Home clicked", Toast.LENGTH_SHORT).show();
    }

    public HomeFragment() {
        // Required empty public constructor
    }
}
