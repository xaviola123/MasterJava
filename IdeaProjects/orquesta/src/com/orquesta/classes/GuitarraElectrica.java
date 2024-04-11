package com.orquesta.classes;

import com.orquesta.classes.Guitarra;

public class GuitarraElectrica extends Guitarra {
    private int potencia;

    public GuitarraElectrica(String nombre, String tipo,int potencia) {
        super(nombre, tipo);
        this.potencia=potencia;
    }



    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @author 6002701 Javier
     * este metodo toca un tipo de guitarra
     */

    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Tocando..."+this.getNombre()+" "+this.getTipo()+" con la potencia de "+this.getPotencia()+" Watios");
    }
}
