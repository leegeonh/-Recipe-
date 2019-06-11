package com.example.cknck.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class RecommandActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView listView;
    private FoodListAdapter adapter;
    private List<Food> foodList;
    private FoodManager foodManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommand);
        Intent intent = getIntent();

        listView = (ListView) findViewById(R.id.listView);
        foodManager = new FoodManager();
        System.out.println(foodManager.foods);
        foodList = foodManager.foods;
        /*
        foodList = new ArrayList<Food>();

        //음식 객체는 이런식으로 만들면 됩니다. 관리하기 편하게 소스 페이지를 새로 만드는 게 좋을 수도 있겠네요
        ArrayList<Ingredient> ingredients01 = new ArrayList<Ingredient>();;
        ingredients01.add(new Ingredient("스팸",100f));
        ingredients01.add(new Ingredient("달걀",1));
        Food food01  = new Food("스팸덮밥", ingredients01, "v1M6bVv1FkU", R.drawable.img_food01);

        ArrayList<Ingredient> ingredients02 = new ArrayList<Ingredient>();;
        ingredients02.add(new Ingredient("스팸",100f));
        ingredients02.add(new Ingredient("달걀",2));
        Food food02 = new Food("참치덮밥", ingredients02, "dHwqEo3Ceug", R.drawable.img_food05);

        ArrayList<Ingredient> ingredients03 = new ArrayList<Ingredient>();;
        ingredients03.add(new Ingredient("스팸",100f));
        ingredients03.add(new Ingredient("달걀",3));
        Food food03 = new Food("김치리조또", ingredients03, "tjcAlTjsAsY", R.drawable.img_food06);
        ///////////////////////////////////////////



        foodList.add(food01);
        foodList.add(food02);
        foodList.add(food03);
*/
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