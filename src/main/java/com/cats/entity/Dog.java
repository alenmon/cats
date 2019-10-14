package com.cats.entity;

public class Dog {
    public String color = "white";
    public String groom = "groom";

    public String woof() {
        return "woof";
    }

    public static void groom(char S, char M, char L) {
        if (S > M || M > L) {
            throw new IllegalArgumentException("Mistake");
        }
    }

}
