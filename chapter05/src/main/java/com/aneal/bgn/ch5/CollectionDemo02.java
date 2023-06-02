package com.aneal.bgn.ch5;
/**
 * When you iterate this list, it is difficult to determine which objects you are handling
 * without complicated code analyzing the type of each object. This was mentioned at the
 * end of Chapter 4 when generics were introduced. The code to iterate the list and process
 * the elements is depicted next to show you why this is a bad idea and bad practice in this
 * day and age of Java.
 */

import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Performer;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo02 {
    public static void main(String[] args) {
        List objList = new ArrayList();
        objList.add("temp");
        objList.add(Integer.valueOf(5));
        objList.add(new Performer("John", 40, 1.91f, Gender.MALE, ""));

        for (Object obj: objList){
            if (obj instanceof String){
                System.out.println("String object = " + obj.toString());
            } else if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                System.out.println("Integer object = " + obj.toString());
            } else{
                Performer p = (Performer) obj;
                System.out.println("Performer object = " + p.getName());
            }
            /**
             * Maybe this is not clear to you now, but to use the contents of the list, you have to
             * know all the types of objects that were put in the list. This might be doable when you are
             * working on a small project, but in a bigger project with multiple developers involved,
             * this can get messy really fast.
             */
        }
    }
}
