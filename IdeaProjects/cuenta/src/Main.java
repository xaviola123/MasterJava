import classes.Cuenta;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Antonio");
        Cuenta cuenta2 = new Cuenta("Antonio");

        System.out.println("INGRESOS");

        cuenta.ingresar("Antonio",30.5);

        System.out.println("RETIROS");

        cuenta.retirar("Antonio",30.5);

        }
    }
