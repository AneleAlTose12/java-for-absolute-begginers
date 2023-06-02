package com.aneal.bgn.ch5;

/**
 * If the name of the field is done, a getter named getDone() would
 * be pretty unintuitive and stupid, but one named isDone() would be quite the opposite.
 * Let’s write that class and also add a main method to test the default value of the done field.
 */
public class ConvertProcess {
    /* other fields and methods */
    private boolean done;
    public boolean isDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done = done;
    }

    public static void main(String[] args) {
        ConvertProcess cp = new ConvertProcess();
        System.out.println("Default value = " + cp.isDone());
    }
}
