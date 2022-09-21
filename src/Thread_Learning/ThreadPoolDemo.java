package Thread_Learning;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+":"+ finalI);
            });
        }
        threadPoolExecutor.shutdown();
    }
}
