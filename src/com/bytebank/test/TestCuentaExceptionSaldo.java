package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(235,453);

        cuenta.depositar(210);
        try {
            cuenta.retirar(210);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
