package com.example.avijeet.testapp2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

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
        new LongOperation().execute("");
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

    private class LongOperation extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {

            Document doc = null;
            Elements newsHeadlines = null;

            try {
                doc = Jsoup.connect("http://news.google.co.in/").get();
//                System.out.println("Doc ---> " + doc.toString());
                newsHeadlines = doc.select(".section-content .esc-lead-article-title-wrapper");
                System.out.println("X");
                System.out.println(newsHeadlines.attr("span"));
                System.out.println("Y");
            } catch (Exception e) {
                Log.e("Damn!", "Not Working!");
            }

            for (int i=0; i<5; i++) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    Thread.interrupted();
                }
            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            Log.i("MSG: ", "Executed");
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }
}
