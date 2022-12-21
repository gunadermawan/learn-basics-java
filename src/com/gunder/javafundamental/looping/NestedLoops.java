package com.gunder.javafundamental.looping;

public class NestedLoops {
    public static void main(String[] args) {
        int value = 5;
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
