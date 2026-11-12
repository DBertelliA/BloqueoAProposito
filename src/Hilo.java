import java.util.concurrent.locks.ReentrantLock;

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
            System.out.println(i);
                Transferencia.transferencia(c1,c2,valor);
            System.out.println(nombre + " ha realizado una transferencia");
            }
        }
    }


