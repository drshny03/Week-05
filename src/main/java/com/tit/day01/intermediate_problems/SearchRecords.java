package com.tit.day01.intermediate_problems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class SearchRecords {

    public static void main(String ar[]) throws FileNotFoundException {
        String filePath = "C:\\capgeminitraining\\Week-5\\CSV-Data-Handling\\src\\main\\resources\\ employees.csv";
        String employeeName = "Darshan Yadav";

        FileReader reader = new FileReader(filePath);

        try(CSVReader csvReader =new CSVReader(reader))
        {
            String [] data;

            boolean header = true;
            boolean employeFound = false;

            while((data =csvReader.readNext())!=null)
            {
                if(header)
                {
                    header = false;
                    continue;
                }
                if(employeeName.equals(data[1].trim()))
                {
                    employeFound = true;
                    out.println("Employee Name : "+ employeeName +"\nDepartement : "+ data[2]+"\nSalary :"+data[3]);
                    break;
                }
            }
            if(!employeFound)
            {
                out.println("No Employee Found");
            }
        }
        catch (FileNotFoundException e)
        {
            out.println("file not found");
        } catch (IOException e)
        {
            out.println("exception while reading file");
        } catch (CsvValidationException e)
        {
            out.println("data not valid");
        }

    }

}
