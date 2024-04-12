package com.animales.clases;

import com.animales.aplicacion.Main;
import com.animales.interfaces.Mascota;

public class Peces extends Animales implements Mascota {
    private final String nombre;
    public Peces(String nombre) {
    this.nombre=nombre;
    }
    /**
     * metodo que hace andar al objeto dependiendo de las patas que tenga
     * @param numPatas = numero de patas que tiene el objeto
     */
    @Override
    public void andar(int numPatas) {
        super.andar(numPatas);
        System.out.println("Los peces tienen  " +numPatas+ " patas, asi que no puede andar pero si nadar!!!");
    }
    /**
     * metodo que hace comer al objeto.
     */
    @Override
    public void comer() {
        super.comer();
        System.out.println("los peces comen plancton: ");
    }
    /**
     * metodo que implementa la interfaz mascota y hace que juege ese objeto
     */
    @Override
    public void jugar() {
        Mascota.super.jugar();
        System.out.println("Soy "+this.nombre+" Estoy Nadando...");
    }
}
