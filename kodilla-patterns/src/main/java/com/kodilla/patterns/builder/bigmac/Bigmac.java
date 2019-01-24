package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private String bun;
    private boolean roll;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BigmacBuilder {

        private String bun = "";
        private boolean roll = false;
        private int burgers = 1;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder roll(boolean roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (!bun.equals("") && roll == true) {
                throw new IllegalStateException("Jeden Bigmac, jedna bułka!");
            }
            return new Bigmac(bun, roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final boolean roll, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public boolean isRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", roll=" + roll +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

enum Buns {

    BEZSEZAMU("bez sezamu"),
    ZSEZAMEM("z sezamem");

    private String description;

    Buns(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

enum Souces {

    STANDARD("standard"),
    TYSIACWYSP("1000 wysp"),
    BARBECUE("barbecue");

    private String description;

    Souces(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

enum Ingredients {
    SALATA("sałata"),
    CEBULA("cebula"),
    BEKON("bekon"),
    OGOREK("ogórek"),
    PAPRYCZKI("papryczki"),
    CHILI("czili"),
    PIECZARKI("pieczarki"),
    KREWETKI("krewetki"),
    SER("ser");

    private String description;

    Ingredients(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
