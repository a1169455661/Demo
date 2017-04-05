package com.example.touna.demo;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by touna on 2016/11/17.
 */

public class MyListView extends Activity {

    private ListView listViewV;
    // 声明数组链表，其装载的类型是ListItem(封装了一个Drawable和一个String的类)
   // private ArrayList<ListItem> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 指定Activity的布局使用activity_main.xml
        setContentView(R.layout.listviewlayout);
//        // 通过findviewByID获取到ListView对象
//        listViewV = (ListView) findViewById(R.id.listView);
//        // 获取Resources对象
//        Resources res = this.getResources();
//        mList = new ArrayList<MyListView.ListItem>();
//        // 初始化data，装载八组数据到数组链表mList中
//        ListItem item1 = new ListItem();
//        item1.setImage(res.getDrawable(R.mipmap.image1));
//        item1.setTitle("项目1");
//        mList.add(item1);
//
//        ListItem item2 = new ListItem();
//        item2.setImage(res.getDrawable(R.mipmap.image1));
//        item2.setTitle("项目2");
//        mList.add(item2);
//
//        ListItem item3 = new ListItem();
//        item3.setImage(res.getDrawable(R.mipmap.image1));
//        item3.setTitle("项目3");
//        mList.add(item3);
//
//        ListItem item4 = new ListItem();
//        item4.setImage(res.getDrawable(R.mipmap.image1));
//        item4.setTitle("项目4");
//        mList.add(item4);
//
//        ListItem item5 = new ListItem();
//        item5.setImage(res.getDrawable(R.mipmap.image1));
//        item5.setTitle("项目5");
//        mList.add(item5);
//
//        ListItem item6 = new ListItem();
//        item6.setImage(res.getDrawable(R.mipmap.image1));
//        item6.setTitle("项目6");
//        mList.add(item6);
//
//
//
//        MainListViewAdapter adapter1 = new MainListViewAdapter();
//        listViewV.setAdapter(adapter1);


    }
//    class MainListViewAdapter extends BaseAdapter{
//        /**
//         * 返回item的个数
//         */
//        @Override
//        public int getCount(){
//            return mList.size();
//
//        }
//        /**
//         * 返回item的内容
//         */
//        @Override
//        public Object getItem(int position){
//
//            return mList.get(position);
//        }
//        /**
//         * 返回item的id
//         */
//        @Override
//        public long getItemId(int position){
//            return position;
//        }
//        /**
//         * 返回item的视图
//         */
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent){
//            ListItemView listItemV;
//            if (convertView == null){
//                // 通过LayoutInflater将xml中定义的视图实例化到一个View中
//                convertView = LayoutInflater.from(MyListView.this).inflate(R.layout.items,null);
//                // 实例化一个封装类ListItemView，并实例化它的两个域
//                listItemV = new ListItemView();
//                listItemV.imageView = (ImageView) convertView.findViewById(R.id.image);
//                listItemV.textView = (TextView) convertView.findViewById(R.id.text);
//                // 将ListItemView对象传递给convertView
//                convertView.setTag(listItemV);
//            }
//            else {
//                // 从converView中获取ListItemView对象
//                listItemV = (ListItemView) convertView.getTag();
//
//            }
//            // 获取到mList中指定索引位置的资源
//            Drawable img = mList.get(position).getImage();
//            String title = mList.get(position).getTitle();
//            // 将资源传递给ListItemView的两个域对象
//            listItemV.imageView.setImageDrawable(img);
//            listItemV.textView.setText(title);
//
//            return convertView;
//
//
//        }
//
//
//    }
//    /**
//     * 封装两个视图组件的类
//     */
//    class ListItemView {
//        ImageView imageView;
//        TextView textView;
//    }
//    class ListItem{
//        private Drawable image;
//        private String title;
//
//        public Drawable getImage(){
//            return image;
//        }
//        public void setImage(Drawable image){
//            this.image = image;
//
//        }
//        public String getTitle(){
//            return title;
//        }
//        public void setTitle(String title){
//            this.title = title;
//        }
//    }

}
