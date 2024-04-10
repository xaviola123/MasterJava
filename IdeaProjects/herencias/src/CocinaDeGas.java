public class CocinaDeGas extends Electrodomestico{
    String tipoGas;

    public CocinaDeGas(String nombre, double precio, int velocidad, String voltaje,String tipoGas) {
        super(nombre, precio, velocidad, voltaje);
    }


    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    @Override
    public void encender() {
        System.out.println("Cocina de Gas: "+super.nombre+ " Encendida!!!");;
    }

    @Override
    public void apagar() {
        System.out.println("Cocina de gas: "+super.nombre+ " apagada!!!");
    }

    @Override
    public String toString() {
        return "CocinaDeGas{" +
                "tipoGas='" + tipoGas + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
