package com.aneal.bgn.ch5;

public class CounterThread01 extends Thread{
    @Override
    public void run(){
        System.out.println(this.getName() + " started...");
        for (int i = 0; i < 10; ++i){
            try{
                Thread.sleep(i * 10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + " ended.");
    }
}
