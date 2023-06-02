//package com.aneal.bng.ch7.ex;
//
//public class ExceptionFlowDemo {
//    public static final int arr[] = {5, 1, 4, 2, 3};
//
//    public static void main(String[] args) {
//        try {
//            checkNotEven(arr);
//            System.out.println("Not found, all good!");
//        } catch (EvenException e){
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Cleaning up arr");
//            for (int i = 0; i < arr.length; ++i){
//                arr[i] = 0;
//            }
//        }
//    }
//    public static int checkNotEven(int ... arr) throws EvenException{
//        for (int i = 0; i < arr.length; ++i){
//            if (arr[i] % 2 == 0){
//                throw new EvenException("Did not expect an even number at " + i);
//            }
//        }
//        return  -1;
//    }
//}
