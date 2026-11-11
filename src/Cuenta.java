public class Cuenta {
    private double saldo;
    private String numC;

    public Cuenta(String numC, double saldo) {
        this.saldo = saldo;
        this.numC = numC;
    }

    synchronized public double getSaldo() {
        return saldo;
    }

    synchronized public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    synchronized public void ingresaCantidad(double ingreso){
        setSaldo(getSaldo() + ingreso);
    }

    synchronized public void sacarCantidad(double sacada){
        setSaldo(getSaldo() - sacada);
    }

    public String getNumC(){
        return numC;
    }

    @Override
    synchronized public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La cuenta " + numC + " se ha quedado con: ").append(saldo);
        return sb.toString();
    }
}
