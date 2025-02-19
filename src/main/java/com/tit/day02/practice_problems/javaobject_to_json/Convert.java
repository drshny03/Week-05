package com.tit.day02.practice_problems.javaobject_to_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Convert {


    public static void main(String[] args) {
        Car car = new Car("Hyundai", "Verna", "Black");

        Gson gson = new Gson();
        String json = gson.toJson(car);

        System.out.println(json);
    }
}
