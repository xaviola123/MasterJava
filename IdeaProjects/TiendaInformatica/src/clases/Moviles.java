package clases;

public class Moviles extends Tienda {

    String operador;


    public Moviles(int precio, int codigo, int cantidad, String nombre, String modelo,String operador) {
        super(precio, codigo, cantidad, nombre, modelo);
    }



    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Moviles{" +
                "operador='" + operador + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
