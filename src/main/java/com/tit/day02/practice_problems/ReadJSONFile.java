package com.tit.day02.practice_problems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.util.Map;

public class ReadJSONFile {


    public static void main(String[] args) {
        String filePath = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\readjsonfile.json";
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> jsonMap = mapper.readValue(new File(filePath), Map.class);

            // Extract specific fields
            String name = (String) jsonMap.get("name");
            String email = (String) jsonMap.get("email");

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
