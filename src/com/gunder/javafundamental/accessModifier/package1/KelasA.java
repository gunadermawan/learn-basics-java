package com.gunder.javafundamental.accessModifier.package1;

public class KelasA {
    //    private modifier
    private int memberA = 5;
    //    default modifier
    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        int hasil = memberA + functionA();
        return hasil;
    }

    protected void methodC() {
        System.out.println("percobaan access modifier");
    }
}
