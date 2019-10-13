package com.cats.entity;

public class Child {
    public void paintCat(Cat cat, String color) {
        cat.color = color;
    }

    public void paintDog(Dog dog, String color) {
        dog.color = color;
    }

    public void beardDog(Dog dog, String groom) {
        dog.groom = groom;
    }
}
