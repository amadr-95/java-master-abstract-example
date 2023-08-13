package com.example;

import java.util.regex.Pattern;

public class PhoneReport extends ExtractorReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone numbers";
    }
}
