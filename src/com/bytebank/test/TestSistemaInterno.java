package com.bytebank.test;

import com.bytebank.modelo.Administrador;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador administrador = new Administrador();

        gerente.setClave("AluraCursosOnLine");
        administrador.setClave("AluraCursosOnLine");

        sistema.autenticar(gerente);
        sistema.autenticar(administrador);
    }
}
