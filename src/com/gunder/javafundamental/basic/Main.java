package com.gunder.javafundamental.basic;

import com.gunder.javafundamental.basic.car.Cars;
import com.gunder.javafundamental.basic.laptop.Linux;
import com.gunder.javafundamental.basic.laptop.Macbook;
import com.gunder.javafundamental.basic.laptop.Windows;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java!");
        Cars.piston();
        Macbook.OperatingSystem();
        Windows.windows();
        Linux.LinuxOs();
//        using library
        Date today = new Date();
        System.out.println("hari ini: " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("besok: " + tomorrow);
    }
}
