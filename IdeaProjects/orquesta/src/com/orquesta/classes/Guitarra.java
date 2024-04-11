package com.orquesta.classes;

public class Guitarra extends Instrumento {
    private int numCuerdas;

    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }



    public Guitarra(String nombre, String tipo) {
        super(nombre, tipo);
    }


}
