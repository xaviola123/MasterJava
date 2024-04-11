package com.orquesta.classes;

public class Instrumento {
    String nombre;
    String tipo;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * este metodo saca el nombre del intrumento tocado segun la instancia del objeto que sea
     */
    public void tocar() {
        System.out.println("Tocando el instrumento  " + nombre);
    }
    /**
     * este metodo saca el nombre del intrumento afinado segun la instancia del objeto que sea
     */
    public void afinar() {
        System.out.println("Afinando el instrumento " + nombre);
    }
}