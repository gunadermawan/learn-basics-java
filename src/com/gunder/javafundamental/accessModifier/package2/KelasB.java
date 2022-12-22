package com.gunder.javafundamental.accessModifier.package2;

import com.gunder.javafundamental.accessModifier.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("pemanggilan ini dilakukan diluar package");
    }
}
