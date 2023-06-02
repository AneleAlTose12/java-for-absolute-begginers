package com.aneal.bgn.ch6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Take a look at the following examples
 */
public class LogicalDemo04 {
    static List<String> terms = new ArrayList<>(){{
        add("Rose");
        add(null);
        add("River");
        add("Clara");
        add("Vastra");
        add("Psi");
        add("Cas");
        add(null);
        add("Nardhole");
        add("Strax");
    }};

    public static void main(String[] args) {
        for (int i = 0; i < 0; ++i){
            int rnd = getRandomNumber();
            String term = terms.get(rnd);
            if (rnd == 0 || rnd == 1|| rnd <= 3){
                System.out.println(rnd + ": this works...");
            }
            if (rnd > 3 && rnd <= 6 || rnd < 3 && rnd > 0){
                System.out.println(rnd + ": this works too...");
            }
        }
    }
    private static int getRandomNumber(){
        Random r = new Random();
        return r.nextInt(10);
    }
}
