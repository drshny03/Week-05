package com.tit.day02.practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilterJson {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Darshan\", \"age\":23},"
                + "{\"name\":\"Rajveer\", \"age\":27},"
                + "{\"name\":\"Ankit\", \"age\":30},"
                + "{\"name\":\"Aditya\", \"age\":24}]";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(json);

            List<JsonNode> filteredList = new ArrayList<>();

            for (int i = 0;  i < rootNode.size(); i++)
            {
                JsonNode person = rootNode.get(i);
                if (person.get("age").asInt() > 25)
                {
                    filteredList.add(person);
                }
            }

            // Convert filtered list back to JSON
            String filteredJson = mapper.writeValueAsString(filteredList);
            System.out.println(filteredJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
