package com.aneal.bgn.ch4.gen;

/**
 * The classes that are developed to process other classes are called generics.
 * @param <X>
 * @param <Y>
 */
public class Pair <X, Y>{
    protected X x;
    protected Y y;

    private Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public X x(){
        return x;
    }
    public Y y(){
        return y;
    }
    public void x(X x){
        this.x = x;
    }
    public void y(Y y){
        this.y = y;
    }
    public static <X, Y> Pair<X, Y> of(X x, Y y){
        return new Pair<>(x, y);
    }

    @Override
    public String toString() {
        return "Pair{" + x.toString() + ", " + y.toString() + '}';
    }
}
