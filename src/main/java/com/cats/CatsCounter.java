package com.cats;

public class CatsCounter {
    /*public static void main(String[] args) {
        System.out.print(calculateCats(10000, 5));
    }*/

    public static int calculateCats(int cat1, int cat2) {
        if(cat1 > 1000 || cat2 > 1000) {
            throw new IllegalArgumentException("Hren");
        }

        int sum = cat1 + cat2;

        if (sum == 8) {
            return 9;
        } else {
            return sum;
        }

    }
}