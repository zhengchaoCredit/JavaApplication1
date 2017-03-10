package Thread_readWriteLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class Test_ReadWriteLock {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        
        ShareAccount account = new ShareAccount("95528",10000);
        ReadWriteLock lock = new ReentrantReadWriteLock(false); //false:非公平性
        ReadWriteLock lock1 = new ReentrantReadWriteLock(true); //true:公平
        
        //ExecutorService pool = Executors.newFixedThreadPool(2); 
        ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        User girl0 = new User("刘珍珍0",account,-500,lock,false);
        User girl1 = new User("刘珍珍1",account,-500,lock,false);
        User girl2 = new User("刘珍珍2",account,-500,lock,false);
        User girl3 = new User("刘珍珍3",account,-500,lock,false);
        User girl4 = new User("刘珍珍4",account,-500,lock,false);
        User girl5 = new User("刘珍珍5",account,-500,lock,false);
        User girl6 = new User("刘珍珍6",account,-500,lock,false);
        User girl7 = new User("刘珍珍7",account,-500,lock,false);
        User girl8 = new User("刘珍珍8",account,-500,lock,false);
        User girl9 = new User("刘珍珍9",account,-500,lock,false);
        
        pool.execute(girl0);
        pool.execute(girl1);
        pool.execute(girl2);
        pool.execute(girl3);

        /**
        * excute方法无返回值，submit方法有返回值
        * Future接口提供方法来检测任务是否被执行完，等待任务执行完获得结果，
        * 也可以设置任务执行的超时时间。这个设置超时的方法就是实现Java程序执行超时的关键。
        */
        Future future = pool.submit(girl9);
        future.get();  //girl9不执行完，下面的都不会执行
        System.out.println("********");
        
        Future future0 = pool.submit(girl8);
        try {
            future0.get(100, TimeUnit.MILLISECONDS);  //设置超时时间：100ms
        } catch (TimeoutException ex) {
            System.out.println("********超时啦*****");
            Logger.getLogger(Test_ReadWriteLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pool.execute(girl4);
        pool.execute(girl5);
        pool.execute(girl6);
        pool.execute(girl7);
        
        /**
           shutdown()：执行后不再接收新任务，如果里面有任务，就执行完；
           通常shutdown之后调用awaitTermination(long timeout, TimeUnit unit)，
           作用是：后者会阻塞当前线程，等待剩余任务执行完，然后继续往下执行。
           shutdownNow()：执行后不再接受新任务，如果有等待任务，移出队列；有正在执行的，尝试停止之；
        */
        pool.shutdown();
        pool.awaitTermination(30, TimeUnit.SECONDS);  
        
        System.out.println("%%%%%"+account.getCash());
    }
}
