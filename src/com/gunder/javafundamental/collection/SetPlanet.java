package com.gunder.javafundamental.collection;

import java.util.HashSet;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set
        System.out.println("ukuran set awal: " + planets.size());
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }
        planets.remove("venus");
        System.out.println("ukuran set awal: " + planets.size());
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }
    }
}
