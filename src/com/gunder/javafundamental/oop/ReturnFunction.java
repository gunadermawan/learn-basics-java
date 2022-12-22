package com.gunder.javafundamental.oop;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 8;
        double l = 4;
        double hasil = calculate(p, l);
        System.out.println("hasilnya adalah: " + hasil);
        int pjg = 10;
        int lbr = 5;
        int luas = calculate(pjg, lbr);
        System.out.println("hasil luas integer adalah: " + luas);

    }

    //    function overloading
    private static int calculate(int pjg, int lbr) {
        int luas = pjg * lbr;
        return luas;
    }

    //    function with return
    public static double calculate(double p, double l) {
        double luas = p * l;
        return luas;
    }

}
