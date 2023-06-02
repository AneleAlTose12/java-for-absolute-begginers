package com.aneal.bng.ch7;

/**
 * Here in this class we are correcting what we did in SeasonSwitchDemo.
 * We will modify the switch statement.
 */
public class SeasonSwitchDemo01 {
    public static void main(String[] args) {
        //Read
        int a = Integer.parseInt(args[0]);

        var season = "";
        switch (a){
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(season);
    }
}
