package com.aneal.bgn.ch6;
/**
 * But, think about it like this: if the term is null, should we even evaluate the equality
 * to “Rose”, especially since calling a method on a null object causes a runtime error?
 * Obviously not, which is why the & is not suitable for this case. If the term is null, it fails
 * the first condition; there is no point in evaluating the second. And so, enter the &&
 * shortcut operator that does exactly this. This works because when using the logical AND
 * operator, if the first term is false, it does not really matter what the second term is equal
 * to, the result is always false. So, we can correct the previous code sample as follows.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LogicalDemo02 {
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
            if (term != null && term.equals("Rose")){ //(*)
                System.out.println("Rose was found");

            }
        }
    }
    private static int getRandomNumber(){
        Random r = new Random();
        return r.nextInt(10);
    }
}
