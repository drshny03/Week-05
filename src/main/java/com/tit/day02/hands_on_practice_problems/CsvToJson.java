package com.tit.day02.hands_on_practice_problems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.BufferedReader;
import java.io.FileReader;

public class CsvToJson {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\convertcsvjson.csv";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String headerLine = br.readLine();
        String[] headers = headerLine.split(",");

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode jsonArray = mapper.createArrayNode();

        String line;
        while ((line = br.readLine()) != null)
        {
            String[] values = line.split(",");
            ObjectNode jsonObject = mapper.createObjectNode();
            for (int i = 0; i < headers.length; i++)
            {
                jsonObject.put(headers[i], values[i]);
            }
            jsonArray.add(jsonObject);
        }
        br.close();

        String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
        System.out.println(jsonOutput);
    }
}
