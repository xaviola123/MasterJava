package com.interfaces.classes;

import com.interfaces.Interfaces.Imprimible;

public class Factura implements Imprimible {
    private int nFactura;
    private int codigoCliente;

    public Factura(int nFactura, int codigoCliente) {
        this.nFactura = nFactura;
        this.codigoCliente = codigoCliente;
    }

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * este metodo me devuelve el informe largo del Codigocliente mas su numero de factura
     */
    @Override
    public void informeLargo() {
        System.out.println("Codigo Cliente "+this.codigoCliente +" numero de Factura: "+this.nFactura);
    }

    /**
     * este metodo me devuelve el numero de factura
     */
    @Override
    public void informeCorto() {
        System.out.println("Numero de factura: "+this.nFactura);
    }
}
