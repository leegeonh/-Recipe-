package com.example.cknck.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FavoritesActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView listView;
    private FavoriteListAdapter adapter;
    private List<Food> favoriteList;

    boolean isNone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Intent intent = getIntent();

        TextView noFavoriteAlert = (TextView) findViewById(R.id.noFavoriteAlert);
        listView = (ListView) findViewById(R.id.listView);
        favoriteList = new ArrayList<Food>();

        FoodManager foodManager = new FoodManager();

        isNone = true;
        for (int i = 0; i < foodManager.foods.size(); i++){
            if (foodManager.foods.get(i).isFavorite == true) {
                favoriteList.add(foodManager.foods.get(i));
                isNone = false;
            }
        }

        if(isNone)
            noFavoriteAlert.setText("좋아요한 레시피가 없습니다.");


        adapter = new FavoriteListAdapter(getApplicationContext(), favoriteList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                // putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값
                intent.putExtra("url", favoriteList.get(position).getUrl());

                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}