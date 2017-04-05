package com.example.touna.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by touna on 2016/11/18.
 */

public class MyTowActivity extends Activity {
    private ImageView image;
    private TextView text;
    private ListView ListV;
    private List<String> data = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytowlayout);
        image = (ImageView) findViewById(R.id.iv_backBase);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        text = (TextView) findViewById(R.id.tv_titleBase);
        text.setText(getIntent().getStringExtra("title"));
        TextView top_one = (TextView) findViewById(R.id.top_title_one);
        top_one.setOnClickListener(topOnClick);
        TextView top_tow = (TextView) findViewById(R.id.top_title_tow);
        top_tow.setOnClickListener(topOnClick);
        TextView top_three = (TextView) findViewById(R.id.top_title_three);
        top_three.setOnClickListener(topOnClick);


        data.add("小明");
        data.add("应收20000元");
        data.add("逾期10天");

        ListV = (ListView) findViewById(R.id.listView_id);
        collAdapter coll = new collAdapter(data);
        ListV.setAdapter(coll);
        ListV.setOnItemClickListener(listViewItem);

    }
    AdapterView.OnItemClickListener listViewItem = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            System.out.println(data.get(i));

            Intent in =new Intent(MyTowActivity.this,MyThreeActivity.class);
//            in.putExtra("title",t.getText().toString());
//
//            startActivity(in);
            startActivity(in);


        }
    };
    private View.OnClickListener topOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.top_title_one:


                    System.out.println("22121212");
                    break;
                case R.id.top_title_tow:
                    System.out.println("111111");
                    break;
                case R.id.top_title_three:
                    System.out.println("3333333");
                    break;


            }
        }
    };


}
