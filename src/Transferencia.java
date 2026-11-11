public class Transferencia {

    public static boolean transferencia(Cuenta c1, Cuenta c2, double cantidad) {
        //aumento de saldo a c2 con el saldo de c1

        if(cantidad > 0 && c1.getSaldo() > cantidad){
            c1.sacarCantidad(cantidad);
            c2.ingresaCantidad(cantidad);
            return false;
        }
        return true;
    }
}
