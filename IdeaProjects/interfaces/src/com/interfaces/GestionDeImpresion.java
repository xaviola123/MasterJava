//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.interfaces;

import com.interfaces.classes.Factura;
import com.interfaces.classes.Pagina;

public class GestionDeImpresion {
    public static void main(String[] args) {

    Pagina p1 = new Pagina(30,5);
    p1.informeCorto();
    p1.informeLargo();

    Factura f1 = new Factura(52,6);
    f1.informeCorto();
    f1.informeLargo();
    }
}