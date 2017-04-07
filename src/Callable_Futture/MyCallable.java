package Callable_Futture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyCallable implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) throws InterruptedException, ExecutionException{
        
        ReentrantLock lock = new ReentrantLock();
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
//        ThreadPoolExecutor exe;
//        exe = new ThreadPoolExecutor(2,4, 200, TimeUnit.MICROSECONDS,new LinkedBlockingQueue<Runnable>());

        List<Future<Object>> list = new ArrayList<Future<Object>>();
        
        //Create MyCallable instance
        Callable<Object> callable = new MyCallable();
        
        for(int i=0; i< 15; i++){
            Future<Object> future = executor.submit(callable);
            list.add(future);
        }
        
        //看他的输出，你能感受到executor线程池的调度情况，线程池中有5个线程，轮流使用
        for(Future<Object> fut : list){
            System.out.println("ThreadName*************"+fut.get());
        }
        executor.shutdown();
    }
}