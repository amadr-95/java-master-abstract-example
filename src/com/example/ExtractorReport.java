package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    private String parse(String path) throws FileNotFoundException {
        StringBuilder str = new StringBuilder();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        //skip the header
        if (sc.hasNext())
            sc.nextLine();

        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            if (getPattern().matcher(line).matches()) {
                if (str.isEmpty())
                    str.append(line);
                else
                    str.append("\n").append(line);
            }
        }
        return str.toString().isBlank() ? "empty file" : str.toString();
    }

    public void sendReport(String path) throws FileNotFoundException {
        System.out.println("Preparing report for: " + getReportName());
        String report = parse(path);
        System.out.println(report);
    }

}
