package com.example.touna.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by touna on 2016/11/29.
 */

public class MyThreeActivity extends Activity {

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mythreelayout);

        ImageView imag = (ImageView) findViewById(R.id.iv_backBase);
        imag.setOnClickListener(pop);
        TextView title = (TextView) findViewById(R.id.tv_titleBase);
        title.setText("催收工单详情");

    }
    private View.OnClickListener pop = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            finish();


        }
    };
}
