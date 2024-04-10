import classes.Cafetera;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera miCafetera = new Cafetera(); // Crear una nueva cafetera con capacidad máxima predeterminada
        /*menu cafetera*/
        System.out.println("1-llenar cafetera");
        System.out.println("2-Servir Cafe");
        System.out.println("3-Vaciar Cafetera");
        System.out.println("4-Agregar cafe ala cafetera");
        System.out.println("0-SALIR");


        int option = scanner.nextInt();


        while(option!=0){
            switch (option){
                case 1:
                    miCafetera.llenarCafetera(); // Llenar la cafetera
                    break;
                case 2:
                    miCafetera.servirCafe(500); // Servir café
                    break;
                case 3:
                    miCafetera.vaciarCafetera(); // Vaciar la cafetera
                    break;
                case 4:
                    miCafetera.agregarCafe(250); // Agregar café
                    break;


                default:

                    break;
            }
             option = scanner.nextInt();
        }
        System.out.println("saliendo....");
    }
}
