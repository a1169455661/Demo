package com.example.touna.demo;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by touna on 2016/11/29.
 */

public class collAdapter extends BaseAdapter {


    private List<String> data = new ArrayList<>();

    public  collAdapter(List<String> data){

        this.data = data;

    }

    @Override
    public int getCount(){

        return this.data.size();
    }

    @Override
    public Object getItem(int position){

        return data.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Context context = parent.getContext();
        Item item = null;
        if (convertView == null){
            item = new Item();
            convertView = LayoutInflater.from(context).inflate(R.layout.cell_item,parent,false);
            item.name = (TextView) convertView.findViewById(R.id.name_text);
            item.money = (TextView) convertView.findViewById(R.id.money_text);
            item.time = (TextView) convertView.findViewById(R.id.time_text);
            convertView.setTag(item);
        }
        else
        {
            item = (Item) convertView.getTag();
        }
        if (data.size() > 0){

          //  String str = data.get(position);
            item.name.setText(data.get(0));
            item.money.setText(data.get(1));
            item.time.setText(data.get(2));
        }

        return convertView;

    }
    private static class Item{

        TextView  name;
        TextView  money;
        TextView  time;

    }

}
