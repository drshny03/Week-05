package com.tit.day02.hands_on_practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;
import java.io.File;
import java.util.Set;

public class ValidateEmail {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Load JSON schema
        JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance();
        JsonSchema schema = schemaFactory.getSchema(new File("C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\schema.json").toURI());

        // Load JSON data
        JsonNode jsonData = mapper.readTree("{ \"email\": \"invalid-email\" }");

        // Validate JSON
        Set<ValidationMessage> errors = schema.validate(jsonData);

        if (errors.isEmpty()) {
            System.out.println("Valid Email!");
        } else {
            System.out.println("Invalid Email! Errors: " + errors);
        }
    }
}
