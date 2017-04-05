package com.example.touna.demo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by touna on 2016/11/18.
 */

public class MyDemoActivity extends Activity {
    TextView t;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydemolatout);
       // RelativeLayout out = (RelativeLayout) findViewById(R.id.three);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.one:

                t = (TextView) findViewById(R.id.ont_title);
//                System.out.println(t.getText().toString());
                Intent in =new Intent(MyDemoActivity.this,MyTowActivity.class);
                in.putExtra("title",t.getText().toString());

                startActivity(in);
                break;
            case R.id.tow:
                TextView te = (TextView) findViewById(R.id.tow_title);
                System.out.println(te.getText().toString());
                break;
            case R.id.three:
                Intent map = new Intent(MyDemoActivity.this,baiduMap.class);
                startActivity(map);
                break;

        }

    }

}
