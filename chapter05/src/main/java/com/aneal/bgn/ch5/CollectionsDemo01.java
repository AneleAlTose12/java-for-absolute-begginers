package com.aneal.bgn.ch5;
/**
 * Starting with Java 1.5 collections have become generic, which allows developers
 * more precision and security when working with them. Before Java 1.5, collections could
 * contain any type of objects. Developers can still write code like this:
 */

import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Performer;

import java.util.*;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List objList = new ArrayList();
        objList.add("temp");
        objList.add(Integer.valueOf(5));
        objList.add(new Performer("John",40, 1.91f, Gender.MALE, "" ));
    }
}
