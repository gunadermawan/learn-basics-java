package com.gunder.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
//        menggunakan hashMap
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key-1", new Planet("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

//        hashMap size
        System.out.println("Map size: " + planets.size());
        for (String key : planets.keySet()) {
            System.out.println("\t" + key + ":" + planets.get(key));
        }
        planets.remove("key-2");
        for (String key : planets.keySet()) {
            System.out.println("\t" + key + ":" + planets.get(key));
        }
    }
}
