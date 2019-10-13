package com.cats.entity;

public class Cat {
    private String defaultColor = "black";
    public String color = defaultColor;

    public String meow() {
        return "meow";
    }
    public static String staticMeow() {
        return "meow";
    }
}
