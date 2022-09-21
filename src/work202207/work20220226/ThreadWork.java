package work202207.work20220226;

public class ThreadWork implements Runnable {

    private int i ;

    public ThreadWork(int _i) {
        this.i=_i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
