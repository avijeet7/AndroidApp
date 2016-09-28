package com.example.avijeet.testapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String msg = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate has fired!");
    }

    protected void gotoNextActivity(View view) {
        Intent nextActivity = new Intent(this, Main2Activity.class);
        nextActivity.putExtra("Name","avijit");
        startActivity(nextActivity);
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
}
