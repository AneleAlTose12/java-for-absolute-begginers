package com.aneal.bng.ch7;

/**
 * This looks ugly right? There is a better do this checkout SeasonDemo01
 */
public class SeasonDemo {
    public static void main(String[] args) {
        //Read a
        int a = Integer.parseInt(args[0]);

        if(a == 12 || (a>=1 && a<=2)){
            System.out.println("Winter");
        } else{
            if(a>2 && a<=5){
                System.out.println("Spring");
            } else{
                if(a>5 && a<=8){
                    System.out.println("Summer");
                } else{
                    if(a>8 && a<=11){
                        System.out.println("Autumn");
                    } else{
                        System.out.println("Error");
                    }
                }
            }
        }
    }
}
