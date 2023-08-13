package com.example;

import java.io.FileNotFoundException;

public class Main {
    private static final String path = "src/data.txt";

    public static void main(String[] args) {

        ExtractorReport[] reports = {
                new PhoneReport(),
                new EmailReport(),
                new NameReport()
        };

        try {
            for (ExtractorReport report : reports) {
                report.sendReport(path);
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
