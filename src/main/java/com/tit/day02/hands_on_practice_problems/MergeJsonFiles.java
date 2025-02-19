package com.tit.day02.hands_on_practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFiles {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json1 = mapper.readTree(new File("C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\merge01.json"));
        JsonNode json2 = mapper.readTree(new File("C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\merge02.json"));

        // Merge JSON objects
        ObjectNode mergedJson = (ObjectNode) json1;
        mergedJson.setAll((ObjectNode) json2);

        // Print merged JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));
    }
}
