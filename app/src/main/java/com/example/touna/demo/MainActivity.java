package com.example.touna.demo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyDemoActivity first = new MyDemoActivity();
//        MyListView tow = new MyListView();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.home_home, first).add(R.id.tow_tow, tow).hide(tow).show(first);
//        fragmentTransaction.commit();


    }
}
