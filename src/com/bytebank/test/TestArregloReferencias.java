package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        CuentaCorriente cc = new CuentaCorriente(23,44);


        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];
        System.out.println(obtenido);

        CuentaAhorros ca = new CuentaAhorros(44,55);
        referencias[3] = ca;

        System.out.println(cc);
        System.out.println(referencias[0]);

        referencias[0] = new CuentaCorriente(11,99);
        System.out.println(referencias[2]);

        //Cast
        CuentaCorriente cuenta =  (CuentaCorriente) referencias[1];

        System.out.println(cuenta);

        for(Object c : referencias){
            System.out.println(c);
        }
    }
}
