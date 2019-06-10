package com.example.cknck.recipe;

public class Food {

    String foodName;
    Ingredient ingredients[];
    String url;
    int image;
    boolean isFavorite;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
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

    public Food(String foodName, Ingredient[] ingredients, String url, int image) {
        this.foodName = foodName;
        this.ingredients = ingredients;
        this.url = url;
        this.image = image;
        this.isFavorite = false;
    }
}
