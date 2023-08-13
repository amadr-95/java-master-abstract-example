package com.example;

import java.io.FileNotFoundException;

public class Main {
    private static final String path = "src/data.txt";

    public static void main(String[] args) {

        ExtractorReport phoneNumbers = new PhoneReport();
        ExtractorReport emails = new EmailReport();
        ExtractorReport names = new NameReport();
        try {
            phoneNumbers.sendReport(path);
            System.out.println();
            emails.sendReport(path);
            System.out.println();
            names.sendReport(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
