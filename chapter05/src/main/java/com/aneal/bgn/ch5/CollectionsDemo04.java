package com.aneal.bgn.ch5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo04 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList = new LinkedList<>();
        stringList.forEach(element -> System.out.println(element));

    }

}
