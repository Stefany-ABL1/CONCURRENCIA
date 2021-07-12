import java.util.Random;

public class RunExample implements Runnable {

    private int cont;

    @Override
    public synchronized void run() {
        for(cont=1;cont<=10;cont++){
            System.out.println(Thread.currentThread().getName()+"->"+cont);
            try {
                Thread.sleep((new Random().nextInt(501)+500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
