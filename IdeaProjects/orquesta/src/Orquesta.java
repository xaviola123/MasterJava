import com.orquesta.classes.Flauta;
import com.orquesta.classes.GuitarraElectrica;
import com.orquesta.classes.Tambor;

public class Orquesta {
    public static void main(String[] args) {
    Flauta flauta = new Flauta("Saxofon \uD83C\uDFB7","Viento","metalico");
    flauta.tocar();
    GuitarraElectrica guitarra = new GuitarraElectrica("Guitarra \uD83C\uDFB8","Electrica",250);
    guitarra.tocar();
    Tambor tambor = new Tambor("Tambor","Percusion",5);
    tambor.aporrear();
   

    }
}