package com.example.eighthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<HashMap<String,String>> array=new ArrayList();
    HashMap <String,String> hash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hash=new HashMap<>();
        hash.put("Name","Ammu");
        hash.put("Mobile","01715158647");
        array.add(hash);

        hash=new HashMap<>();
        hash.put("Name","Abbu");
        hash.put("Mobile","01736291732");
        array.add(hash);

        hash=new HashMap<>();
        hash.put("Name","Tuhin");
        hash.put("Mobile","01788899814");
        array.add(hash);

        hash=new HashMap<>();
        hash.put("Name","Nanu");
        hash.put("Mobile","01930073477");
        array.add(hash);

        hash=new HashMap<>();
        hash.put("Name","mama");
        hash.put("Mobile","01920124152");
        array.add(hash);


        list=findViewById(R.id.list);
        MyAdapter adap=new MyAdapter();
        list.setAdapter(adap);


    }


    //////T/U////////////////////////H///I///N//////



    private class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return array.size() ;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inf= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vw=inf.inflate(R.layout.item,parent,false);
            LinearLayout lin=vw.findViewById(R.id.lin);

            ImageView img=vw.findViewById(R.id.img);
            TextView tv=vw.findViewById(R.id.tv);
            TextView tv2=vw.findViewById(R.id.tv2);

            HashMap <String,String> hashMap=array.get(position);
            String n=hashMap.get("Name");
            String p=hashMap.get("Mobile");
            tv.setText(n);
            tv2.setText(p);

            lin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, ""+hashMap.get("Name"), Toast.LENGTH_SHORT).show();
                }
            });

            return vw;
        }
    }


}