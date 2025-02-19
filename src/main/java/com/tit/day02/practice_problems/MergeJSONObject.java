package com.tit.day02.practice_problems;

import org.json.JSONObject;

public class MergeJSONObject {

    public static void main(String[] args)
    {
        JSONObject json1 = new JSONObject();

        json1.put("Name", "Darshan");
        json1.put("Email", "darshanyadav@7049.com");


        JSONObject json2 = new JSONObject();
        json2.put("Age", 22);
        json2.put("City", "Bhopal");

        for (String key : json2.keySet())
        {
            json1.put(key, json2.get(key));
        }

        System.out.println(json1.toString());
    }
}
