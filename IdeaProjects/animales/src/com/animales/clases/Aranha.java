package com.animales.clases;

public class Aranha extends Animales{
    public Aranha() {
        super();
    }
    /**
     * metodo que hace andar al objeto dependiendo de las patas que tenga
     * @param numPatas = numero de patas que tiene el objeto
     */
    @Override
    public void andar(int numPatas) {
        super.andar(numPatas);
        System.out.println("la araña anda sobre "+numPatas+" patas.");
    }
    /**
     * metodo que hace comer al objeto.
     */
    @Override
    public void comer() {
        super.comer();
        System.out.println("la araña come mosquitos.");
    }
}
