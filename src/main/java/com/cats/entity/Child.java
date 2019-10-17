package com.cats.entity;

import static com.cats.entity.Wool.*;

public class Child {
    public void paintCat(Cat cat, String color) {
        cat.color = color;
    }

    public void paintDog(Dog dog, String color) {
        dog.color = color;
    }

    public void beardDog(Dog dog, Wool wool) {

        if (dog.wool.equals(M) && wool.equals(L) || dog.wool.equals(S) && wool.equals(M) || dog.wool.equals(S) && wool.equals(L)) {
            throw new IllegalArgumentException("Mistake");
        }

        dog.wool = wool;

    }


    // у собаки шерсть М и кто-то передает шерсть L
    // dog.wool == М && wool == L
}
