package classes;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Otro constructor para permitir inicializar la capacidad máxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    // Metodos para acceder y modificar la cantidad actual de café
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Metodo para llenar la cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("llenando Cafetera con ....☕☕☕ "+cantidadActual+" c.c Cafetera llena de cafe☕.");
    }

    // Metodo para servir café
    public void servirCafe(int cantidad) {
        if (cantidad <= cantidadActual) {
            cantidadActual -= cantidad;
            System.out.println("Sirviendo...☕☕☕  un cafe☕ de: " + cantidad + " c.c. cantidad de cafe en la Cafetera:--> "+cantidadActual);
        } else {
            System.out.println("No hay suficiente cafe en la cafetera. "+cantidadActual);
        }
    }

    // Metodo para vaciar la cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Cafetera vaciada.Cantidad actual en la Cafetera----->"+cantidadActual+" c.c ☕☕☕");

    }

    // Metodo para agregar cafe a la cafetera
    public void agregarCafe(int cantidad) {
        System.out.println("cantidad de cafe ☕ en la cafetera: "+cantidadActual+" se desea agregar: "+cantidad+"☕☕☕");
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;

            System.out.println("Agregados " + cantidad + " c.c. de café☕ a la cafetera.Capacidad de cafetera: "+cantidadActual+" c.c☕☕☕");
        } else {
            System.out.println("No se puede agregar ☕☕☕ esa cantidad, la cafetera se desbordaria.");
        }
    }


}
