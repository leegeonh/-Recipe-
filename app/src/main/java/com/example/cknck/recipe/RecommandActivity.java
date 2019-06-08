package com.example.cknck.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecommandActivity extends AppCompatActivity {

    private ListView listView;
    private FoodListAdapter adapter;
    private List<Food> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommand);
        Intent intent = getIntent();

        listView = (ListView) findViewById(R.id.listView);
        foodList = new ArrayList<Food>();

        foodList.add(new Food("감자볶음"));
        foodList.add(new Food("오므라이스"));
        foodList.add(new Food("스팸덮밥"));
        foodList.add(new Food("음식4"));
        foodList.add(new Food("음식5"));
        foodList.add(new Food("음식6"));
        foodList.add(new Food("음식7"));


        adapter = new FoodListAdapter(getApplicationContext(), foodList);
        listView.setAdapter(adapter);



    }

}