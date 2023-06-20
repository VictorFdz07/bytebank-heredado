package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int numero = 40;
        //WRAPPER
        //Integer numeroObjeto = new Integer(40); deprecado
        //Integer numeroObjeto = Integer.valueOf(40); deprecado
        Integer numeroObjeto = 40;

        List<Integer> lista = new ArrayList<>();
        lista.add(numero); // autoboxing
        lista.add(numeroObjeto);

        // unboxing
        //int valorPrimitivo = numeroObjeto.intValue();
        int valorPrimitivo = numeroObjeto;

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
