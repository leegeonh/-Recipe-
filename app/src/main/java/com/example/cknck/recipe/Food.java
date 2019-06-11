package com.example.cknck.recipe;

import java.util.ArrayList;

public class Food {

    String foodName;

    //Ingredient ingredients[];
    String url;
    int image;
    boolean isFavorite;

    ArrayList<Ingredient> ingredients;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Food(String foodName, ArrayList<Ingredient> ingredients, String url, int image) {
        this.foodName = foodName;
        this.ingredients = ingredients;
        this.url = url;
        this.image = image;
        this.isFavorite = false;
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
