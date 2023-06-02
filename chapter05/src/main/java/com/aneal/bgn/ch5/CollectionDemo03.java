package com.aneal.bgn.ch5;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo03 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        for (String s: stringList){
            System.out.println(s);
        }
        /**
         * A List contains an unsorted collection of non-unique data, null elements
         * included. In the example, we declared a reference of type List<T> and an object of type
         * ArrayList<T>. We did this because as all implementations have the same API, we could
         * easily switch ArrayList<T> with LinkedList<T> and the code still works. Declaring
         * abstract references is a good programming practice.
         * List<String> stringList = new ArrayList<String>();
         * stringList = new LinkedList<String>();
         */
    }
}
