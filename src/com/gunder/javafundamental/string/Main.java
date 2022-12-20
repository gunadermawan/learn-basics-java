package com.gunder.javafundamental.string;

public class Main {
    public static void main(String[] args) {
        String name = "Android";
        int lengthName = name.length();
        System.out.println(lengthName);

//      constructor string
        char[] nameChar = {'a', 'n', 'd', 'r', 'o', 'i', 'd'};
        String nameString = new String(nameChar);
        System.out.println(nameString);

//        get some character
        char resultChar = name.charAt(1);
        System.out.println(resultChar);
    }
}
