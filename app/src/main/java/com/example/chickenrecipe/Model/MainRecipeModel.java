package com.example.chickenrecipe.Model;

public class MainRecipeModel {
    private int recipeImage;
    private String recipeTitle;

    public MainRecipeModel(int recipeImage, String recipeTitle) {
        this.recipeImage = recipeImage;
        this.recipeTitle = recipeTitle;
    }

    public int getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(int recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }
}
