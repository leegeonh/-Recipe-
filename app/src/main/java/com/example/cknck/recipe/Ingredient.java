package com.example.cknck.recipe;

public class Ingredient {
    String name;
    int quantity;
    float kilo;

    Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.kilo = 0;
    }

    Ingredient(String name, float kilo) {
        this.name = name;
        this.kilo = kilo;
        this.quantity = 0;
    }
}
