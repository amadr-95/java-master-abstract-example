package com.example;

import java.io.FileNotFoundException;

public class Main {
    private static final String path = "src/data.txt";
    public static void main(String[] args) {
         NumberExtractorReport extractorReport = new NumberExtractorReport();
        try {
            extractorReport.sendReport(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
