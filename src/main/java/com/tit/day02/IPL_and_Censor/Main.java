package com.tit.day02.IPL_and_Censor;

public class Main {
    public static void main(String[] args) {

        String inpiutjson = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\ ipl_data.json";
        String outputjson = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\censoredipl.json";

        String inputcsv = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\ ipl_data.csv";
        String outputcsv = "C:\\capgeminitraining\\Week-5\\JSON\\src\\main\\resources\\censoredipl.csv";

        JsonProcessor.processJson(inpiutjson,outputjson);

        CsvProcessor.processCsv(inputcsv, outputcsv);

        System.out.println("Censorship applied successfully!");
    }
}
