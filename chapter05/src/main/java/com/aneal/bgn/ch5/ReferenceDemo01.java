package com.aneal.bgn.ch5;
/**
 * The interface reference types cannot be instantiated, but objects of class types that
 * extend that interface can be assigned to references of that interface type. The hierarchy
 * used in Chapter 4 is depicted in Figure 5-10.
 */

import com.aneal.bgn.ch4.hierarchy.*;

public class ReferenceDemo01 {
    public static void main(String[] args) {
        Performer performer = new Performer("John", 40, 1.91f, Gender.MALE, "");
        Human human = new Performer("Jack", 40, 1.91f, Gender.MALE, "");
        Actor actor = new Performer("Jean", 40, 1.91f, Gender.MALE, "");
        Musician musician = new Performer("Jodie", 40, 1.71f, Gender.FEMALE, "");
        }
    }
