package com.tuantrandev.tuantran.gridviewdemo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    private Context context;
    private final int item_image[];
    private final String item_text[];

    public CustomAdapter(Context context, int item_image[], String item_text[]) {
        this.context = context;
        this.item_image = item_image;
        this.item_text = item_text;
    }

    @Override
    public int getCount() {
        return item_text.length;
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if (convertView == null) {
            gridView = new View(context);

            // get layout from custom_gridview.xml
            gridView = layoutInflater.inflate(R.layout.custom_gridview, null);

            // set value into imageview
            ImageView image = (ImageView) gridView.findViewById(R.id.imgView);
            image.setImageResource(item_image[position]);

            // set value into textview
            TextView text = (TextView) gridView.findViewById(R.id.tvContent);
            text.setText(item_text[position]);
        } else {
            gridView = (View) convertView;
        }

        return gridView;

    }
}
