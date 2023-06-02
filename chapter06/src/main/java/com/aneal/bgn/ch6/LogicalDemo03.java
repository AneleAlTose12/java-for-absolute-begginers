package com.aneal.bgn.ch6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * So, when the preceding code is executed, no exception is thrown, because if the term
 * is null, the second condition is not evaluated.
 * Let’s modify the previous code sample, but this time, let’s print the message if we
 * find a null or if we find “Rose”.
 */
public class LogicalDemo03 {
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
            if (term == null | term.equals("Rose")){ //(*)
                System.out.println("Rose was found");
            }
        }
    }
    private static int getRandomNumber(){
        Random r = new Random();
        return r.nextInt(10);
    }
    /**
     * If we run the previous code, the use of | throws a NullPointerException because
     * this operator requires both expressions to be evaluated. So, if term is null, calling
     * .equals(...) causes the exception to be thrown. So, to make sure that the code works
     * as expected, the | must be replaced with ||, which shortcuts the condition and does not
     * evaluate the second expression. This works because when using the logical OR operator,
     * if the first term is true, it does not really matter what the second term is equal to; the
     * result is always true. We’ll leave that as an exercise for you.
     * Of course, conditions can be made up from more than one expression and more
     * than one operator, whether it is && or ||. Take a look at the following examples
     */

}
