package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(23,33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaCorriente(13,44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Victor");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(20,11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Javier");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaCorriente(2,22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Linda");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Antes de ordenar");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }

        lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        System.out.println("Despues de ordenar con lambdas");
        lista.forEach(System.out::println);

        lista.sort((Cuenta o1, Cuenta o2) -> o1.getTitular().getNombre()
                        .compareTo(o2.getTitular().getNombre()));

        System.out.println("Despues de ordenar por nombre titular");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }
        //Pre java 8
        Collections.sort(lista, (c1,c2)-> c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre()));
    }
}
