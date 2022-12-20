package com.gunder.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua:");
        int value2 = scanner.nextInt();
        int result = value2 + value;
        System.out.println("hasilnya adalah: " + result);
    }
}
