package com.example.cknck.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecommandActivity extends AppCompatActivity implements View.OnClickListener {

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

        //음식 객체는 이런식으로 만들면 됩니다. 관리하기 편하게 소스 페이지를 새로 만드는 게 좋을 수도 있겠네요
        Ingredient[] ingredients01 = new Ingredient[10];
        ingredients01[0] = new Ingredient("스팸",100f);
        ingredients01[1] = new Ingredient("달걀",1);
        Food food01  = new Food("스팸덮밥", ingredients01, "v1M6bVv1FkU", R.drawable.img_food01);

        Ingredient[] ingredients02 = new Ingredient[10];
        ingredients02[0] = new Ingredient("스팸",100f);
        ingredients02[1] = new Ingredient("달걀",2);
        Food food02 = new Food("참치덮밥", ingredients02, "dHwqEo3Ceug", R.drawable.img_food05);

        Ingredient[] ingredients03 = new Ingredient[10];
        ingredients03[0] = new Ingredient("스팸",100f);
        ingredients03[1] = new Ingredient("달걀",3);
        Food food03 = new Food("김치리조또", ingredients03, "tjcAlTjsAsY", R.drawable.img_food06);
        ///////////////////////////////////////////



        foodList.add(food01);
        foodList.add(food02);
        foodList.add(food03);

        adapter = new FoodListAdapter(getApplicationContext(), foodList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                // putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값
                intent.putExtra("url", foodList.get(position).getUrl());

                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}