package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Cuenta> lista = new ArrayList<>();

        Cuenta cc = new CuentaCorriente(11,22);
        Cuenta cc2 = new CuentaCorriente(13,42);
        Cuenta cc3 = new CuentaCorriente(11,22);

        lista.add(cc);
        lista.add(cc2);


        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for (Cuenta c : lista){
            System.out.println(c);
        }

        boolean contiene = lista.contains(cc3);
        if (contiene){
            System.out.println("Sin es igual (equals)");
        }

    }
}
