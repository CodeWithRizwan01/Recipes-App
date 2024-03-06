package com.example.chickenrecipe.Model;

public class Data {
    private int recipeImage;
    private String recipeTitle;
    private String cockingTime;
    private String calories;
    private String fats;
    private String proteins;
    private String ingredients;
    private String instructions;


    public Data(int recipeImage, String recipeTitle, String cockingTime, String calories, String fats, String proteins, String ingredients, String instructions) {
        this.recipeImage = recipeImage;
        this.recipeTitle = recipeTitle;
        this.cockingTime = cockingTime;
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
        this.ingredients = ingredients;
        this.instructions = instructions;
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

    public String getCockingTime() {
        return cockingTime;
    }

    public void setCockingTime(String cockingTime) {
        this.cockingTime = cockingTime;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getFats() {
        return fats;
    }

    public void setFats(String fats) {
        this.fats = fats;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

}
