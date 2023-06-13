package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {
    public static void main(String[] args) {
        String nombre = "Alura";

        nombre = nombre.replace("A","a");
        nombre = nombre.concat(" Cursos online");
        nombre = nombre.toUpperCase();
        nombre = nombre.toLowerCase();
        char letra = nombre.charAt(3);
        int indice = nombre.indexOf("e");
        printLine(nombre);
        printLine(letra);
        printLine(indice);
        printLine(new CuentaAhorros(200,300));
        System.out.println();
    }

    public static void printLine(Object valor){
        System.out.println(valor.toString());
    }
}
