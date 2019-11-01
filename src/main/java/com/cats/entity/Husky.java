package com.cats.entity;


import org.json.simple.JSONObject;

public class Husky extends Dog {
    public String dogBark() {
        return "Husky barks";
    }

    public static void main(String args[]) {

        JSONObject Husky = new JSONObject();
        Husky.put("Lucy", "White color");

        System.out.println("Name:" + Husky.get("Lucy"));
        System.out.println("Color:" + Husky.get("White color"));

    }

}
