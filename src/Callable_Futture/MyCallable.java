package Callable_Futture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) throws InterruptedException, ExecutionException{
        
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<String>> list = new ArrayList<Future<String>>();
        
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();
        
        for(int i=0; i< 15; i++){
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        
        //看他的输出，你能感受到executor线程池的调度情况，线程池中有5个线程，轮流使用
        for(Future<String> fut : list){
            System.out.println("ThreadName*************"+fut.get());
        }
        executor.shutdown();
    }
}