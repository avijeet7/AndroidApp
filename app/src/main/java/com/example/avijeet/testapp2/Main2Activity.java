package com.example.avijeet.testapp2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Avijeet on 26-Sep-16.
 * New activity on created to learn about the Activities Life cycle
 */

public class Main2Activity extends Activity {
    String msg = "2nd Activity";
    View v;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String name = getIntent().getStringExtra("Name");
        Log.d(msg, "onCreate event has fired!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart has fired!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume has fired!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause has Fired!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop has fired!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy has fired!");
    }

    public void selectFrag(View view) {
        Fragment fr;

        if (view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();
        } else {
            fr = new FragmentOne();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_place, fr);
        ft.commit();
    }
}
