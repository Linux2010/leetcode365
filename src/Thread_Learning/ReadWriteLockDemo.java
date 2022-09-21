package Thread_Learning;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读-读共享
 * 读-写不共享
 * 写-写不共享
 * 写操作要求：原子+独占
 * 手写缓存
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                myCache.put(finalI +"", finalI);
            },String.valueOf(i)).start();
        }

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                myCache.get(finalI);
            },String.valueOf(i)).start();
        }


    }

}


class MyCache{
    private volatile Map<String,Object> map = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void put (String key ,Object value){
        lock.writeLock().lock();

        System.out.println("写入中..."+key);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(key,value);
        System.out.println("写入完成..."+key);
        lock.writeLock().unlock();
    }

    public void get(int key){
        lock.readLock().lock();
        System.out.println("读取中..."+key);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object o = map.get(key);
        System.out.println("读取完成..."+key);
        lock.readLock().unlock();
    }

    public void clearMap(){
        map.clear();
    }


}
