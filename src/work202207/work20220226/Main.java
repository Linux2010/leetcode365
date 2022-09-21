package work202207.work20220226;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        //1,10个线程同时启动，每个线程打印线程名称（1~10）
        //2，输出按照顺序
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for (int i =1;i<11;i++){
            executorService.execute(new ThreadWork(i));
        }
        executorService.shutdown();

    }
}
