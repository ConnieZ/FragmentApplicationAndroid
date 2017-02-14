package com.conniezlabs.fragmentapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentElement extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // the picture source: http://free-icon-rainbow.com/grape-free-icon/
        return inflater.inflate(R.layout.fragment_view, container, false);
    }


}