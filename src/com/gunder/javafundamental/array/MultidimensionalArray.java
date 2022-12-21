package com.gunder.javafundamental.array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

//        indeks pertama
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';
//        indeks kedua
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

//        menampilkan array
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengna indeks 0 adalah: " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengna indeks 1 adalah: " + arrChar[0][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 0 dengna indeks 1 adalah: " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 1 dengna indeks 1 adalah: " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengna indeks 1 adalah: " + arrChar[1][2]);
    }
}
