package com.tit.day02.practice_problems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSONStructure
{
    public static void main(String[] args)
    {
        String json = "{ \"name\": \"Darshan\", \"email\": \"darshanyadav7049@gmail.com\" }";

        if (isValidJson(json)) {
            System.out.println("JSON is valid");
        } else {
            System.out.println("Invalid JSON");
        }
    }

    public static boolean isValidJson(String json)
    {
        try
        {

            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(json);

            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

}
