package com.example.createfragmentwithbundledynamically;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textViewFragment = (TextView) view.findViewById(R.id.textViewFragment);
            textViewFragment.setText(bundle.getString("dataxox"));
        }


        return view;
    }
}
