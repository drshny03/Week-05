package com.tit.day01.basic_problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class ReadAndCountRows{

    public static void main(String ar[]) throws IOException {
        String filePath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\student.csv";

        FileReader reader = new FileReader(filePath);

        try(BufferedReader bufferedReader = new BufferedReader(reader))
        {
            int count =0;
            String line;

            while((line=bufferedReader.readLine())!=null)
            {
               count++;
            }
            count--;
            out.println(count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
