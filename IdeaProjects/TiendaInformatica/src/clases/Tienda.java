package clases;

public class Tienda {
    int precio;
    int codigo;
    int cantidad;
    String nombre;
    String modelo;

    public Tienda(int precio, int codigo, int cantidad, String nombre, String modelo) {
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "precio=" + precio +
                ", codigo=" + codigo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
