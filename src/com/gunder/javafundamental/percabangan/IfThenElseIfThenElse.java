package com.gunder.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int value = 90;
        char index;
        if (value >= 90) {
            index = 'A';
        } else if (value >= 80) {
            index = 'B';
        } else if (value >= 70) {
            index = 'C';
        } else {
            index = 'D';
        }
        System.out.println("nilai akhir anda adalah: " + index);
    }
}
