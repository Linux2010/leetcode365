package Thread_Learning;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 多人抢多资源
 * 6车抢3车位
 */

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore  = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"\t 抢车到车位");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"\t 3秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }


            },String.valueOf(i)).start();
        }
    }
}
