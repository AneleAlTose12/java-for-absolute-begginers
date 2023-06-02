package com.aneal.bng.ch7;

/**
 * In our code, writing each assignment statement
 * three times is a little redundant. switch can be written in a different way to avoid that by
 * grouping the cases.
 */
public class SeasonSwitchDemo {
    public static void main(String[] args) {
        //Read a
        int a = Integer.parseInt(args[0]);

        var season = "";
        switch (a) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Winter";
                break;
            case 3:
                season = "Spring";
                break;
            case 4:
                season = "Spring";
                break;
            case 5:
                season = "Spring";
                break;
            case 6:
                season = "Summer";
                break;
            case 7:
                season = "Summer";
                break;
            case 8:
                season = "Summer";
                break;
            case 9:
                season = "Autumn";
                break;
            case 10:
                season = "Autumn";
                break;
            case 11:
                season = "Autumn";
                break;
            case 12:
                season = "Winter";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(season);
    }
}
