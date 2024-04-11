package com.orquesta.classes;

import com.orquesta.classes.Instrumento;

public class Tambor extends Instrumento {
    private int tamanio;

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Tambor(String nombre, String tipo, int tamanio) {
        super(nombre, tipo);
        this.tamanio=tamanio;
    }

    /**
     * @author 6002701 Javier
     * este metodo aporrea el tambor
     */
    public void aporrear() {
        System.out.println("Aporreando..."+this.getNombre()+" \uD83E\uDD41"+" del tipo "+this.getTipo());
    }
}
