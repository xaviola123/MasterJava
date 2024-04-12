import com.orquesta.classes.Flauta;
import com.orquesta.classes.GuitarraElectrica;
import com.orquesta.classes.Instrumento;
import com.orquesta.classes.Tambor;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
    public static void main(String[] args) {

        List<Instrumento> instrumentos = new ArrayList<>();


        instrumentos.add(new Flauta("Saxofon \uD83C\uDFB7", "Viento", "metalico"));
        instrumentos.add(new GuitarraElectrica("Guitarra \uD83C\uDFB8", "Electrica", 250));
        instrumentos.add(new Tambor("Tambor", "Percusion", 5));
        
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Flauta) {
                ((Flauta) instrumento).tocar();
            } else if (instrumento instanceof GuitarraElectrica) {
                ((GuitarraElectrica) instrumento).tocar();
            } else if (instrumento instanceof Tambor) {
                ((Tambor) instrumento).aporrear();
            }
        }
    }
}
