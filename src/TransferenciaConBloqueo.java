public class TransferenciaConBloqueo {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("ES388388433883838388484", 20500);
        Cuenta c2 = new Cuenta("ES99090499388484889399", 50000);

        Thread th1 = new Thread(new Hilo(c1,c2,1,"Daniel"));
        Thread th2 = new Thread(new Hilo(c2,c1,2,"Patata"));

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
            System.out.println("ya");

        }catch (InterruptedException e){
            System.err.println(e);
        }
    }
}