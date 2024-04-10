public class RepodructorCasette extends Electrodomestico{


    public RepodructorCasette(String nombre, double precio, int velocidad, String voltaje) {
        super(nombre, precio, velocidad, voltaje);
    }

    @Override
    public void encender() {
        System.out.println("Reproductor Cassete: "+super.nombre+ " Encendida!!!");;
    }

    @Override
    public void apagar() {
        System.out.println("Reproductor Cassete: "+super.nombre+ " Encendida!!!");;
    }

    @Override
    public void play() {

        System.out.println("funcionando play pulsado");
    }

    @Override
    public void rewind() {

        int r= (int)(Math.random()*2);
        if(r==0){
            System.out.println("El casette "+" esta rebobinado");
        }else{
            System.out.println("El casette "+" esta sin rebobinado");
        }
    }

    @Override
    public String toString() {
        return "RepodructorCasette{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", velocidad=" + velocidad +
                ", voltaje='" + voltaje + '\'' +
                '}';
    }
}
