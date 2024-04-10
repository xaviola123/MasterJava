public class Lavadora extends Electrodomestico {


    public Lavadora(String nombre, double precio, int velocidad, String voltaje) {
        super(nombre, precio, velocidad, voltaje);
    }


    @Override
    public void encender() {
        System.out.println("Batidora: "+super.nombre+ " Encendida!!!");;
    }

    @Override
    public void apagar() {
        System.out.println("Batidora: "+super.nombre+ " Encendida!!!");;
    }


}

