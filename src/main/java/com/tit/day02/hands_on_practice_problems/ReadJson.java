package com.tit.day02.hands_on_practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class ReadJson {
    public static void main(String[] args) throws Exception
    {
        ObjectMapper mapper = new ObjectMapper();

        String filePath = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\readjsonfile.json";
        JsonNode root = mapper.readTree(new File(filePath));

        Iterator<String> fieldNames = root.fieldNames();
        while (fieldNames.hasNext())
        {
            String key = fieldNames.next();
            JsonNode value = root.get(key);

            if (value.isValueNode())
            {  // If it's a simple value
                System.out.println(key + ": " + value);
            } else
            {
                System.out.println(key + ": " + value.toString()); // Print JSON objects/arrays as strings
            }
        }
    }
}
