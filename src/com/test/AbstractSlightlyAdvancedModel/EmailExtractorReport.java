package com.test.AbstractSlightlyAdvancedModel;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    // this regex is a pattern to determine email
    // can try alt + enter >> Check RegEx to see if input is valid
    private static final Pattern PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
    @Override
    public String getReportName() {
        return "email";
    }

}
