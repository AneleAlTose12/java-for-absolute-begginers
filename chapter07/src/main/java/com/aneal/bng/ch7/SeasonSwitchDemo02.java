package com.aneal.bng.ch7;

/**
 * If we modify the previous
 * example and ask the user for a text representing the month, and use switch to decide the
 * season to print, unless we use the exact text in case options that the user will use when
 * writing the argument, we won’t get the expected result.
 * The code changes to
 */
public class SeasonSwitchDemo02 {
    public static void main(String[] args) {
        //Read
        String a = args[0];

        var season = "";
        switch (a){
            case "january":
            case "february":
            case "december":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Autumn";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(season);
    }
}
