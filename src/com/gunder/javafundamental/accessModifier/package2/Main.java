package com.gunder.javafundamental.accessModifier.package2;

import com.gunder.javafundamental.accessModifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
//        cannot access from outside of package
//        System.out.println(kelasA.functionB());
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);
        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
