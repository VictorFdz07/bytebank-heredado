package com.bytebank.modelo;

public class GuardaReferencias {
    Object[] referencia = new Object[10];
    int indice = 0;

    public void adicionar(Object cc) {
        referencia[indice] = cc;
        indice++;
    }

    public Object obtener(int indice){
        return referencia[indice];
    }
}
