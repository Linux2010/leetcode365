package Thread_Learning;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


/**
 * 主线程等待所有子线程完成后进行下一步操作
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(Math.round(3));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t 子线程做任务...");
                countDownLatch.countDown();
                System.out.println("count:"+countDownLatch.getCount());
            },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println("主线程完成...");
    }
}
