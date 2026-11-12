public class Transferencia {
    private static Object object = new Object();

    public static boolean transferencia(Cuenta c1, Cuenta c2, double cantidad){
        //aumento de saldo a c2 con el saldo de c1
        synchronized (object) {
            synchronized (c1) {
                synchronized (c2) {
                    if (cantidad > 0 && c1.getSaldo() > cantidad) {
                        c1.sacarCantidad(cantidad);
                        c2.ingresaCantidad(cantidad);
                        return false;
                    }
                    return true;
                }
            }
        }
    }
}
