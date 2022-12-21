package com.gunder.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
//        array
        String[] heros = new String[2];
        heros[0] = "supermman";
        heros[1] = "spiderman";
//        array list
        List<String> planets = new ArrayList<>();
        planets.add("mercurius");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
        System.out.println("List planet awal:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index- " + i + " = " + planets.get(i));
        }
        planets.remove("earth");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index- " + i + " = " + planets.get(i));
        }
    }
}
