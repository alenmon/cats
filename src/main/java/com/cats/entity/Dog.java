package com.cats.entity;

import static com.cats.entity.Wool.L;

public class Dog {
    private String color = "white";
    public Wool wool = L;

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String woof() {
        return "woof";
    }
}
