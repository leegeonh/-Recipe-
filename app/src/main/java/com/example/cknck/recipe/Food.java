package com.example.cknck.recipe;
import java.net.URL;

public class Food {

    String foodName;
    Ingredient ingredients[];
    URL url;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Food(String foodName, Ingredient ingredients[], URL url) {
        this.foodName = foodName;
        this.ingredients = ingredients;
        this.url = url;
    }
}
