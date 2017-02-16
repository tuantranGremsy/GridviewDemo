package com.tuantrandev.tuantran.gridviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String items[]={"Canlink","H3","H6","H7","H14","H16","SYNC"};
    int images[] ={R.drawable.canlink, R.drawable.h3, R.drawable.h6, R.drawable.h7, R.drawable.h14, R.drawable.h16, R.drawable.sync};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.grdContent);
        gridView.setAdapter(new CustomAdapter(this, images, items));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
