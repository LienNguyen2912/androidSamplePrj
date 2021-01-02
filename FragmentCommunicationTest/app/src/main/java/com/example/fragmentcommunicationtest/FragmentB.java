package com.example.fragmentcommunicationtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentB extends Fragment {
    TextView textViewB;
    EditText editTextB;
    Button btnChangeMainTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textViewB = view.findViewById(R.id.textViewB);
        editTextB = view.findViewById(R.id.editTextFragmentB);
        btnChangeMainTextView = view.findViewById(R.id.btnBChangeFragATextView);
        btnChangeMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewOnFragmentA = (TextView)getActivity().findViewById(R.id.textViewA);
                textViewOnFragmentA.setText(editTextB.getText().toString());
            }
        });
        return view;
    }
    public void setTextViewText(String text)
    {
        textViewB.setText(text);
    }
}
