public class ReproductorCD extends Electrodomestico{


    public ReproductorCD(String nombre, double precio, int velocidad, String voltaje) {
        super(nombre, precio, velocidad, voltaje);
    }

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public void apagar() {
        super.apagar();
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
        return super.toString();
    }
}
