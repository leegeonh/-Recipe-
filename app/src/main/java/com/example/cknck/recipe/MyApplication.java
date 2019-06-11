package com.example.cknck.recipe;

import android.app.Application;

import java.util.ArrayList;

public class MyApplication extends Application {
    private ArrayList<Food> mGlobalFoods;

    public ArrayList<Food> getGlobalFoods() {
        return mGlobalFoods;
    }

    public void setGlobalFoods(ArrayList<Food> mGlobalFoods) {
        this.mGlobalFoods = mGlobalFoods;
    }
}
