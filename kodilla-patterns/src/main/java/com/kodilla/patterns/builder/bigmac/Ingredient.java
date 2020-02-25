package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONIONS = "ONIONS";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLY = "CHILLY";
    public static final String PEPPERS = "PEPPERS";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    public static final String CHEESE = "CHEESE";
    final private String ingredient;

    public Ingredient(String ingredient) {
        if(ingredient.equals(LETTUCE) || ingredient.equals(ONIONS) || ingredient.equals(BACON) ||
                ingredient.equals(CUCUMBER) || ingredient.equals(CHILLY) || ingredient.equals(PEPPERS) ||
                ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
            this.ingredient = ingredient;
        }
        else {
            throw new IllegalStateException("You can choose: lettuce, onions, bacon, cucumber, chilly peppers, mushrooms, shrimps, cheese");
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
