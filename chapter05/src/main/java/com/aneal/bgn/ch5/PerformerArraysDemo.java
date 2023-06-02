package com.aneal.bgn.ch5;

import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Performer;

public class PerformerArraysDemo {
    public static void main(String[] args) {
        Performer[] array = new Performer[2];
        for (int i = 0; i < array.length; ++i){
            System.out.println("Performer["+ i +"]= " + array[i]);
        }
        array[0] = new Performer("John", 40, 1.91f, Gender.MALE, "");
        array[1] = new Performer("Julianna", 35, 1.61f, Gender.FEMALE, "");

        for (int i = 0; i < array.length; ++i){
            System.out.println("performer["+ i +"]= " + array[i].getName());
        }
    }
}
