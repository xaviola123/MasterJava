import clases.Moviles;
import clases.Ordenador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador(300, 35, 6, "asus", "gaming", "i7", "32gb", "1tb ssd");
        Moviles movil1 = new Moviles(150, 12, 6, "iphone", "10-XR", "yoigo");

        System.out.println(movil1.toString());
        System.out.println(pc1.toString());
    }
}