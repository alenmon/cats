package com.cats.entity;

import static com.cats.entity.Wool.L;

public abstract class Dog {

    private String color = "white";
    private Wool wool = L;

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public Wool getWool() {
        return wool;
    }

    public void setWool(Wool newWool) {
        wool = newWool;
    }

    public String dogBark() {
        return "Dog barks";
    }

}