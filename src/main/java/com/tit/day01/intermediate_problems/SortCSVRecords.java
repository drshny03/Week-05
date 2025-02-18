package com.tit.day01.intermediate_problems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

public class SortCSVRecords {
    //method to read file
    private static List<String[]> readFile (String filePath) throws FileNotFoundException {
        //list to store data
        List<String[]> list = new ArrayList<>();
        //create a csv reader to read data
        FileReader reader = new FileReader(filePath);
        try(CSVReader csvReader = new CSVReader(reader)){
            //array to store data
            String[] employee;
            boolean isHeader = true;
            while ((employee = csvReader.readNext()) != null) {
                //skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                list.add(employee);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        } catch (CsvValidationException e) {
            out.println("data not valid");
        }
        return list;
    }
    //method to sort and print top 5 employee
    private static void sortList(List<String[]> list) {
        //sort employees
        list.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                if(Double.parseDouble(a[3]) > Double.parseDouble(b[3])){
                    return -1;
                }else  if(Double.parseDouble(a[3]) < Double.parseDouble(b[3])){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        //print top 5 employees
        for(int i =0; i<5; i++){
            out.println(Arrays.toString(list.get(i)));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //define file path
        String filePath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\ employees.csv";
        //convert data to list
        List<String[]> list = readFile(filePath);
        //sort employee and print top 5
        sortList(list);
    }
}