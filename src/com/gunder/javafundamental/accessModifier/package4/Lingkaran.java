package com.gunder.javafundamental.accessModifier.package4;

public class Lingkaran {
    static final double PI = 3.14;
    static int jari = 7;

    public static void main(String[] args) {
        getLuas();
    }

     static double getLuas() {
        return PI * jari * jari;
    }
//      TRANSIENT
//    Transient memiliki hubungan dengan proses serialisasi (serializing). Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.
//    Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya di dalam proses serialisasi.

//    Synchronized
//    Synchronized modifier digunakan untuk membatasi akses ke suatu variable/methods yang hanya boleh dilakukan oleh satu thread. Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, maka prosesnya akan dilakukan secara serial (bergantian).
}
