package com.tit.day01.intermediate_problems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.out;

public class Modify
{
    public static void main(String ar[]) throws IOException {
        String inputPath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\ employees.csv";
        String outputPath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\modifyEmployee.csv";

        FileReader reader = new FileReader(inputPath);
        FileWriter writer = new FileWriter(outputPath);

        try(CSVReader csvReader = new CSVReader(reader); CSVWriter csvWriter = new CSVWriter(writer))
        {

            String[] employee;
            boolean isHeader = true;
            while ((employee = csvReader.readNext()) != null) {

                if (isHeader) {
                    isHeader = false;
                  csvWriter.writeNext(employee);
                    continue;
                }
                String employeedDepartment = employee[2].trim();
                if(employeedDepartment.equals("IT")){

                    double oldSalary = Double.parseDouble(employee[3]);
                    double newSalary = oldSalary + (oldSalary * 10 / 100);
                    employee[3] = String.valueOf(newSalary);
                }

                csvWriter.writeNext(employee);
            }
            out.println("salary updated successfully");
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        } catch (CsvValidationException e) {
            out.println("data not valid");
        }


    }
}
