package com.aneal.bgn.ch6;
/**
 * There are four operators that are used to construct
 * complex conditions; two of them are bitwise operations that can be reused: &(AND)
 * and |(OR); but they require evaluation of all the parts of the condition. The operators
 * &&(AND) and ||(OR) have the same effect as the other ones, but the difference is they do
 * not require evaluation of all the expression, which is why they are also called shortcut
 * operators. To explain the difficult behavior of these operators, there is a typical example.
 * Basically, we declare a list of ten terms (some of them null) and a method to generate a
 * random index, used to select an item from the list. Then we test the selected element from
 * the list to see if it is not null and equal to an expected value. If both conditions are true,
 * then a message is printed in the console. Let’s start with the first example.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LogicalDemo01 {
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
        for (int i = 0; i < 20; ++i){
            int rnd = getRandomNumber();
            String term = terms.get(rnd);
            System.out.println("Generated index: " + rnd);
            if (term != null & term.equals("Rose")){ //(*)
                System.out.println("Rose was found");

            }
        }
    }
    private static int getRandomNumber(){
        Random r = new Random();
        return r.nextInt(10);
    }
}
