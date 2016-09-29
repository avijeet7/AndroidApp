package com.example.avijeet.testapp2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Avijeet on 27-Sep-16.
 * First Fragment
 */

public class FragmentTwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Button b1 = (Button)view.findViewById(R.id.btn_search);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("SSS");
            }
        });
        return view;
    }

//    public void changeText(View v) {
//        System.out.println("ASDASD");
//    }
}