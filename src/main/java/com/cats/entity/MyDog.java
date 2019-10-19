package com.cats.entity;

abstract class Dog1 {
    public abstract void dogBark();
}

class Husky extends Dog1 {
    public void dogBark() {
        System.out.println("HuskyBark");
    }

    class MyDog {
        public void main(String[] args) {
            Husky MyHusky = new Husky();
            MyHusky.dogBark();
        }
    }
}
