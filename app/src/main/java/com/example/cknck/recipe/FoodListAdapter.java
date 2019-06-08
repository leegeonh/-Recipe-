package com.example.cknck.recipe;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class FoodListAdapter extends BaseAdapter {

    private Context context;
    private List<Food> foodList;

    public FoodListAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.food, null);
        TextView foodName = (TextView) v.findViewById(R.id.foodName);

        foodName.setText(foodList.get(i).getFoodName());

        v.setTag(foodList.get(i).getFoodName());




        return v;
    }


}

