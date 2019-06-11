package com.example.cknck.recipe;

import java.util.ArrayList;

public class FoodManager {

    public ArrayList<Food> foods;

    void addFood(Food f) {
        foods.add(f);
    }

    public FoodManager() {

        foods = new ArrayList<Food>();

        ArrayList<Ingredient> ingredients01 = new ArrayList<Ingredient>();;
        ingredients01.add(new Ingredient("스팸",100f));
        ingredients01.add(new Ingredient("달걀",1));
        foods.add(new Food("스팸덮밥", ingredients01, "v1M6bVv1FkU", R.drawable.img_food01));

        ArrayList<Ingredient> ingredients02 = new ArrayList<Ingredient>();;
        ingredients02.add(new Ingredient("스팸",100f));
        ingredients02.add(new Ingredient("달걀",2));
        foods.add(new Food("참치덮밥", ingredients02, "dHwqEo3Ceug", R.drawable.img_food05));

        ArrayList<Ingredient> ingredients03 = new ArrayList<Ingredient>();;
        ingredients03.add(new Ingredient("스팸",100f));
        ingredients03.add(new Ingredient("달걀",3));
        foods.add(new Food("김치리조또", ingredients03, "tjcAlTjsAsY", R.drawable.img_food06));

        foods.get(0).setFavorite(true);

    }
}