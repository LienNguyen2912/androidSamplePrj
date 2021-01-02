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

public class FragmentA extends Fragment {
    TextView textViewA;
    EditText editTextA;
    Button btnChangeMainTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        textViewA = view.findViewById(R.id.textViewA);
        btnChangeMainTextView = view.findViewById(R.id.btnAChangeMainTextView);
        editTextA = (EditText)view.findViewById(R.id.editTextFragmentA);
        btnChangeMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewMain = (TextView)getActivity().findViewById(R.id.textViewMain);
                textViewMain.setText(editTextA.getText().toString());
            }
        });
        return view;
    }
    public void setTextViewText(String text)
    {
        textViewA.setText(text);
    }
}
