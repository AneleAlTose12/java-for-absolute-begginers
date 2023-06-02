package com.aneal.bgn.ch5;
/**
 * Multiple reference types, second example
 * The interface reference types cannot be instantiated, but objects of class types that
 * extend that interface can be assigned to references of that interface type. The hierarchy
 * used in Chapter 4 is depicted in Figure 5-10.
 */

import com.aneal.bgn.ch4.hierarchy.*;

public class ReferenceDemo02 {
    public static void main(String[] args) {
        // References can only be of the super-type of an assigned object, so the assignments in
        //the following code snippet will not compile.
        Performer performer = new Performer("John", 40, 1.91f, Gender.MALE, "");
        // these will not compile!!!
        Human human = performer;
        Actor actor = performer;
        Musician musician = performer;

        /**
         * The reason for that is that the methods are called on the reference, so the object the
         * reference is pointing to must have those methods. So, if a reference is of type Performer
         * and getSongs() gets called on it, an object of type actor, like in the last line of code will
         * not have that method. That is why the Java compiler complains, and that is why smart
         * editors notify you by underlining the statement with a red line.
         * Sure, an explicit conversion can be made: performer = (Performer) actor;, and
         * this convinces the compiler that all is well, but this only causes an exception at runtime.
         */

    }
}
