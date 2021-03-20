package page;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStrings {

    public static final String regexSymbols = "(^\\[|\\]|\\<\\>\\$)";
    public static final String regexChars = "^[a-zA-Z. ]+$";
    public static final String regexDigits = "(\\d.+)";
/*
    public static String priceProcessor(String expectedPrice, String regexDigits){

        // get the regex
        Pattern pattern = Pattern.compile(regexDigits);

        // get the value and match it with regex
        Matcher match = pattern.matcher(expectedPrice);
        match.find();

        return match.group(1);

    } // end method priceProcessor()
*/



} // end method RegexStrings
