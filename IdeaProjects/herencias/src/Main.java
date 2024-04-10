import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Inputs*/
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();

        Batidora batidora = new Batidora("Cecote plus99xk-pofresional",36.35,5,"3000w");
        Lavadora lavadora = new Lavadora("bosh Pro-5kg-xlk32",136.35,5,"1500w");
        CocinaDeGas cocinaDeGas = new CocinaDeGas("Cocina huca-01skl",253.8,3,"20w","Gas Ciudad");
        RepodructorCasette casete = new RepodructorCasette("casette",25.99,2,"25w");
        ReproductorCD cd = new ReproductorCD("cd ultimate 22.3trs",40.33,6,"300w");
        TocaDiscos tocaDiscos = new TocaDiscos("tocaDiscos Antiguo",150.3, 2,"60w");

       /*muestro los objetos*/
        System.out.println(batidora.toString());
        System.out.println(lavadora.toString());
        System.out.println(cocinaDeGas.toString());
        System.out.println(casete.toString());
        System.out.println(cd.toString());
        System.out.println(tocaDiscos.toString());



        lavadora.encender();
        cocinaDeGas.encender();
        casete.encender();
        cd.encender();
        tocaDiscos.encender();



        batidora.apagar();
        lavadora.apagar();
        cocinaDeGas.toString();
        casete.apagar();
        cd.apagar();
        tocaDiscos.apagar();


        tocaDiscos.play();
        cd.play();
        casete.play();




    }
    }

