package com.orquesta.classes;

public class Flauta extends Instrumento {
    String modelo;

    public Flauta(String nombre, String tipo, String modelo) {
        super(nombre, tipo);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


/**
 * @author 6002701 Javier
 * Este metodo hace tocar a un intrumento flauta.
 */

    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Soplando... un intrumento de tipo "+this.getTipo()+"\uD83C\uDFB7");
    }
}