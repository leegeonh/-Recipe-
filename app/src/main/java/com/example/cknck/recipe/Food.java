package com.example.cknck.recipe;
import java.net.URL;
import java.util.ArrayList;

public class Food {

    String foodName;
    ArrayList<Ingredient> ingredients;
    URL url;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Food(String foodName, ArrayList<Ingredient> ingredients, URL url) {
        this.foodName = foodName;
        this.ingredients = ingredients;
        this.url = url;
    }

    ArrayList<Ingredient> findMissing(ArrayList<Ingredient> recipeIngredient) {
        ArrayList<Ingredient> missing = recipeIngredient;

        for (int i = 0; i < missing.size(); i++) {
            for (int j = 0; j < ingredients.size(); j++) {
                if (missing.get(i).equals(ingredients.get(j))) {
                    missing.remove(i);
                }
            }
        }

        return missing;
    }
}
