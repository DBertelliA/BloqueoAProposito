public class Hilo implements Runnable{
    private Cuenta c1;
    private Cuenta c2;
    private double valor;
    private String nombre;

    public Hilo(Cuenta c1, Cuenta c2, double valor, String nombre) {
        this.c1 = c1;
        this.c2 = c2;
        this.valor = valor;
        this.nombre = nombre;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++) {
            System.out.println("Voy a hacer mis cosas");
            synchronized (c1) {
                Transferencia.transferencia(c1, c2, valor);
                System.out.println(nombre + " realizó una transferencia");
                synchronized (c2) {
                    System.out.println("Acceso del 1 a 2");
                }
            }

            synchronized (c2){
                Transferencia.transferencia(c1,c2,valor);
                System.out.println(nombre + " realizó una transferencia");
                synchronized (c1){
                    System.out.println("Acceso del 2 a 1");
                }
            }
        }

    }
}


