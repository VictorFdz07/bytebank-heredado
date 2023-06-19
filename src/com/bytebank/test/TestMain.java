package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {

        int[] edades = new int[5];
        edades[2] = 30;
        System.out.println(edades[0]);

        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int e : edades) {
            System.out.println(e);
        }



    }
}
