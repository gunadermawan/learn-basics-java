package com.gunder.javafundamental.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("apakah hewan IS-A objek -> " + (hewan instanceof Object));
        System.out.println("apakah hewan IS-A hewan -> " + (hewan instanceof Hewan));
        System.out.println("apakah hewan IS-A kucing -> " + (hewan instanceof Kucing));

        for (int i = 1; i <= 20; i++) {
            System.out.print("-");
        }

        Kucing kucing = new Kucing();
        System.out.println("apakah hewan IS-A objek -> " + (kucing instanceof Object));
        System.out.println("apakah kucing IS-A hewan -> " + (kucing instanceof Hewan));
        System.out.println("apakah kucing IS-A kucing -> " + (kucing instanceof Kucing));
        hewan.makan();
        kucing.makan();
        kucing.makan("tempe");
        for (int i = 1; i <= 20; i++) {
            System.out.print("-");
        }
        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss? " + meow.equals(puss));
        System.out.println("meow equals popo? " + meow.equals(popo));
    }
}
