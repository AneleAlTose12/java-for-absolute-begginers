package com.aneal.bgn.ch4.hierarchy;
/**
 * The enum type is a special class type. It defines a special type of class that can only be
 * instantiated a fixed number of times. An enum declaration, groups all instances of that
 * enum. All of them are constants. So, the Gender enum can be defined as shown in the
 * following piece of code.
 */
public enum Gender {
    FEMALE(1, "f"),
    MALE(2, "m"),
    UNDEFINED(3, "u"){
        @Override
        public String comment(){
            return "to be decided later: " + getRepr() + ", " + getDescr();
        }
    };
    private final int repr;
    private final String descr;

    Gender(int repr, String descr){
        this.repr = repr;
        this.descr = descr;
    }
    public int getRepr(){
        return repr;
    }
    public String getDescr(){
        return descr;
    }
    public String comment(){
        return repr + ": " + descr;
    }
}
