package com.tit.day01.basic_problems;


import java.io.*;

import static java.lang.System.out;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\writecsv.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Name,Department,Salary\n");
            writer.write("034,Darshan Yadav,IT,50000\n");
            writer.write("088,Rajveer Kajle,Cloud,80000\n");
            writer.write("018,Ankit Gangwani,HR,50000\n");
            writer.write("07,Aditya Raj,IT,80000\n");
            out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

