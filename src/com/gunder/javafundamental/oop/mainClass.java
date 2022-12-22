package com.gunder.javafundamental.oop;

public class mainClass {
    String nameValue;
    int weightValue;

    //    no argument constructor
    public mainClass() {

    }

    //    parameterized constructor
    public mainClass(String name, int weight) {
        nameValue = name;
        weightValue = weight;
    }

    public static void main(String[] args) {
        ObjectHewan objectHewan = new ObjectHewan();
        objectHewan.cetakNama("kucing");
        objectHewan.beratBadan(12);
    }
}
