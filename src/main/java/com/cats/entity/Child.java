package com.cats.entity;

import static com.cats.entity.Wool.*;

public class Child {
    public void paintCat(Cat cat, String color) {
        cat.color = color;
    }

    public void paintDog(Dog dog, String color) {
        dog.setColor(color);
    }

    public void beardDog(Dog dog, Wool wool) {

        if (dog.getWool().equals(M) && wool.equals(L) || dog.getWool().equals(S) && wool.equals(M) || dog.getWool().equals(S) && wool.equals(L)) {
            throw new IllegalArgumentException("Mistake");
        }

        dog.setWool(wool);

    }

    // у собаки шерсть М и кто-то передает шерсть L
    // dog.wool == М && wool == L
}
