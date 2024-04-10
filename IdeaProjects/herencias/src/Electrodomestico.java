public class Electrodomestico {
  String nombre;
  double precio;
  int velocidad;
  String voltaje;

  public Electrodomestico(String nombre, double precio, int velocidad, String voltaje) {
    this.nombre = nombre;
    this.precio = precio;
    this.velocidad = velocidad;
    this.voltaje = voltaje;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public String getVoltaje() {
    return voltaje;
  }

  public void setVoltaje(String voltaje) {
    this.voltaje = voltaje;
  }

  public void encender(){};
    public void apagar(){};
    public void play(){};
    public void rewind(){};

  @Override
  public String toString() {
    return "Electrodomestico{" +
            "nombre='" + nombre + '\'' +
            ", precio=" + precio +
            ", velocidad=" + velocidad +
            ", voltaje='" + voltaje + '\'' +
            '}';
  }
}

