package com.tit.day02.practice_problems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String ar[])
    {
        JSONObject student = new JSONObject();
       student.put("Name","Darshan");
       student.put("Age",22);

        JSONArray jsonArray = new JSONArray();

        jsonArray.put("Maths");
        jsonArray.put("Science");
        jsonArray.put("Enlish");

        student.put("Subjects",jsonArray);

        System.out.println(student.toString());
    }
}
