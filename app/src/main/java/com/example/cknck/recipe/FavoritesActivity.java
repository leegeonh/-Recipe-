package com.example.cknck.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView listView;
    private FavoriteListAdapter adapter;
    private List<Food> favoriteList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Intent intent = getIntent();

        listView = (ListView) findViewById(R.id.listView);
        favoriteList = new ArrayList<Food>();

        //음식 객체는 이런식으로 만들면 됩니다. 관리하기 편하게 소스 페이지를 새로 만드는 게 좋을 수도 있겠네요
        Food[] foods = new Food[2];
        Ingredient[] ingredients01 = new Ingredient[10];
        ingredients01[0] = new Ingredient("스팸",100f);
        ingredients01[1] = new Ingredient("달걀",1);
        foods[0] = new Food("스팸덮밥", ingredients01, "v1M6bVv1FkU", R.drawable.img_food01);

        Ingredient[] ingredients02 = new Ingredient[10];
        ingredients02[0] = new Ingredient("스팸",100f);
        ingredients02[1] = new Ingredient("달걀",2);
        foods[1] = new Food("달걀밥", ingredients02, "dHwqEo3Ceug", R.drawable.img_food02);

        foods[0].setFavorite(true);

        ///////////////////////////////////////////

        boolean isNone = true;
        for (int i = 0; i < foods.length; i++){
            if (foods[i].isFavorite == true) {
                favoriteList.add(foods[i]);
                isNone = false;
            }
        }

        //if(isNone)



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