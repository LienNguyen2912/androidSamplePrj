package com.example.createfragmentwithbundledynamically;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAddFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddFragment = (Button)findViewById(R.id.btnAddFragment);
        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyFragment myFragment = new MyFragment();
                Bundle bundle = new Bundle();
                bundle.putString("dataxox", "data sent from main activity");
                myFragment.setArguments(bundle);

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.mainActivityLinearLayout, myFragment);
                fragmentTransaction.commit();
            }
        });
    }
}