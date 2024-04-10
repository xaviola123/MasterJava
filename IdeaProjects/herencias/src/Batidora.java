import javax.print.DocFlavor;

public class Batidora extends Electrodomestico{


    public Batidora(String nombre, double precio, int velocidad, String voltaje) {
        super(nombre, precio, velocidad, voltaje);
    }



    @Override
    public void encender() {
        System.out.println("lavadora: "+super.nombre+ " Encendida!!!");;
    }

    @Override
    public void apagar() {
        System.out.println("lavadora: "+super.nombre+ " apagada!!!");;
    }

    @Override
    public String toString() {
        return "Batidora{" +
                "velocidad=" + velocidad +
                ", voltaje='" + voltaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
