package com.porto;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nomesIdades = new HashMap<>();

        nomesIdades.put("Joe", 37);
        nomesIdades.put("Bob", 40);
        nomesIdades.put("Lily", 34);
        nomesIdades.put("Mary", 7);

        int idadeJoe = nomesIdades.get("Joe");

        System.out.println(nomesIdades);
        System.out.println(idadeJoe);

        System.out.println(nomesIdades.containsKey("Bob"));
    }
}