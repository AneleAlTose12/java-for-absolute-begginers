package com.aneal.bgn.ch4.except;

import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Performer;

public class PerformerGenerator {
    public static Performer get(String name)
        throws EmptyPerformerException {
        return new Performer("John", 40, 1.91f, Gender.MALE, "");
    }
}
