package com.bytebank.test;

import java.util.*;

public class TestIterador {
    public static void main(String[] args) {
        //Iterator con listas
        List<String> nombres = new ArrayList<>();
        nombres.add("Super Mario");
        nombres.add("Yoshi");
        nombres.add("Donkey Kong");

        Iterator<String> it = nombres.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterator con Set o Colas
        Set<String> nombres2 = new HashSet<>();
        nombres.add("Super Mario");
        nombres.add("Yoshi");
        nombres.add("Donkey Kong");

        Iterator<String> it2 = nombres.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
