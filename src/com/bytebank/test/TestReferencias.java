package com.bytebank.test;

import com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {

		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("_dddddd");
	}
}
