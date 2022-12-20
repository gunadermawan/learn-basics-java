package com.gunder.javafundamental.basic;

import com.gunder.javafundamental.basic.car.Cars;
import com.gunder.javafundamental.basic.laptop.Linux;
import com.gunder.javafundamental.basic.laptop.Macbook;
import com.gunder.javafundamental.basic.laptop.Windows;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java!");
        Cars.piston();
        Macbook.OperatingSystem();
        Windows.windows();
        Linux.LinuxOs();
    }
}
