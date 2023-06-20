package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {
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

        //Ordenar las cuentas
        // Comparator = Cualquier cosa que extienda de cuenta
        lista.sort(new OrdenadorPorNumeroCuenta());

        System.out.println("Despues de ordenar");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }

        lista.sort(new OrdenadorPorNombreTitular());

        System.out.println("Despues de ordenar por nombre titular");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }
        //Pre java 8
        Collections.sort(lista,new OrdenadorPorNombreTitular());
        Collections.sort(lista);

        System.out.println("Despues de ordenar por agencia");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }

        System.out.println("Despues de ordenar por saldo");
        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }

    }
}
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        // Forma basica
        /*if (o1.getNumero() == o2.getNumero()){
            return 0;
        }else if (o1.getNumero() > o2.getNumero()){
            return 1;
        }else{
            return -1;
        }*/
        //Forma intermedia
        //return o1.getNumero() - o2.getNumero();
        //Forma wrapper
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }
}
class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre()
                .compareTo(o2.getTitular().getNombre());
    }
}