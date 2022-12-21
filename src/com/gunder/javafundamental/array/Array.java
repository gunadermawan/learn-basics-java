package com.gunder.javafundamental.array;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("end of array");
        System.out.println();
//        looping array
        System.out.println("starting looping array");
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
