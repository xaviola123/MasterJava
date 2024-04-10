package classes;

public class Cuenta {
    String titular;
    double cantidad;
    double cantidaCuenta;

    public Cuenta(String titular,double cantidad) {
        this.titular = titular;
        this.cantidad=cantidad;
    }
    public Cuenta(String titular){
        this.titular=titular;
    }

    /*metodo que ingresa dinero*/
    public void ingresar(String titular,double cantidad){
        if (cantidad<=0){
            System.out.println("no puedes ingresar numeros negativos en la cuenta: "+this.getTitular());
        }else{
            System.out.println("ingreso de la cantida: "+cantidad+" ingresado CORRECTAMENTE!! de la cuenta de : "+titular);
            cantidaCuenta=cantidad;
        }
    }
    public void retirar(String titular,double cantidad){
        System.out.println("tu cuenta "+titular+" saldo: "+cantidaCuenta+" cantidad a retirar: "+cantidad );
        if((cantidaCuenta-cantidad)>=0){
            System.out.println("Saldo de cuenta: "+(cantidaCuenta-cantidad)+"  Retiro exitoso");
        }else{
            System.out.println("tu cuenta no tiene saldo suficiente para hacer esa retirada "+cantidaCuenta);
        }

    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
