package com.animales.clases;

import com.animales.interfaces.Mascota;

public class Gato extends Animales implements Mascota {
    private final String nombre;
    public Gato(String nombre) {
        this.nombre=nombre;
    }

    /**
     * metodo que hace andar al objeto dependiendo de las patas que tenga
     * @param numPatas = numero de patas que tiene el objeto
     */
    @Override
    public void andar(int numPatas) {
        super.andar(numPatas);
        System.out.println("los Gatos andan sobre--->"+numPatas+" patas.");
    }

    /**
     * metodo que hace comer al objeto.
     */
    @Override
    public void comer() {
        super.comer();
        System.out.println("A los gatos les gusta comer peces y arañas:");
    }

    /**
     * metodo que implementa la interfaz mascota y hace que juege ese objeto
     */
    @Override
    public void jugar(){
        Mascota.super.jugar();
        System.out.println("A "+this.nombre+" le gusta jugar con pelotas");
    }
}
