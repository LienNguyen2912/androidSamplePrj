package com.example.fragmentcommunicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMain;
    Button btnChangeFragmentTextView;
    FragmentA fragmentA;
    FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMain = (TextView)findViewById(R.id.textViewMain);
        btnChangeFragmentTextView = (Button)findViewById(R.id.btnChangeFragmentTextView);
        fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
        fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        btnChangeFragmentTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentA.setTextViewText(getResources().getString(R.string.new_fragment_textView));
                fragmentB.setTextViewText(getResources().getString(R.string.new_fragment_textView));
            }
        });

    }
}