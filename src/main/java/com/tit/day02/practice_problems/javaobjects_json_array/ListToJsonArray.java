package com.tit.day02.practice_problems.javaobjects_json_array;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {

    public static void main(String[] args) {
        try {

            List<Student> students = new ArrayList<>();
            students.add(new Student("Darshan", 22));
            students.add(new Student("Rajveer", 19));
            students.add(new Student("Ankit", 23));


            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(students);


            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
