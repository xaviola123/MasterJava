package com.interfaces.classes;

import com.interfaces.Interfaces.Imprimible;

public class Pagina implements Imprimible {
    private int nPagina;
    private int nLineas;

    public Pagina(int nPagina, int nLineas) {
        this.nPagina = nPagina;
        this.nLineas = nLineas;
    }

    public int getnPagina() {
        return nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public int getnLineas() {
        return nLineas;
    }

    public void setnLineas(int nLineas) {
        this.nLineas = nLineas;
    }

    /**
     * este metodo me devuelve el numero de paginas sumada a sus lineas.
     * El TOTAL DE LAS LINEAS DEL INFORME.
     */
    @Override
    public void informeLargo() {

        System.out.println("Numero de paginas: "+this.nPagina+" Numero de Lineas: "+this.nLineas);
    }

    /**
     * este metodo me devuelve el numero de paginas y las lineas que tiene cada pagina
     */
    @Override
    public void informeCorto() {
        System.out.println("Numero de paginas: "+this.nPagina);
    }
}
