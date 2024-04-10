package clases;

public class Ordenador extends Tienda{
    String procesador;
    String memoria;
    String discoDuro;


    public Ordenador(int precio, int codigo, int cantidad, String nombre, String modelo,String procesador,String memoria, String discoDuro) {
        super(precio, codigo, cantidad, nombre, modelo);
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "procesador='" + procesador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", discoDuro='" + discoDuro + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
