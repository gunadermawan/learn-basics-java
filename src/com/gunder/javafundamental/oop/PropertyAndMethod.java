package com.gunder.javafundamental.oop;

public class PropertyAndMethod {

    public static void main(String[] args) {
        ObjectHewan kucing = new ObjectHewan();
        kucing.beratBadan(2);
        kucing.cetakNama("cemplin");
    }

    public class Hewan {
        double tinggi = 30;
        double berat = 3;
        // Inisiasi melalui konstruktor
        int umur;

        //      method
        void lari() {
            System.out.println("hewan berlari");
        }
    }
}
