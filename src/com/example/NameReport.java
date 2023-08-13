package com.example;

import java.util.regex.Pattern;

public class NameReport extends ExtractorReport{
    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z ]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Names";
    }
}
