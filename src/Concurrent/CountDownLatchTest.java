package Concurrent;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author zhengchao
 */
public class CountDownLatchTest extends Thread{
    
    @Override
    public void run() {  
        System.out.println("&&&&&&");  
        try {  
            Thread.sleep(10000);  
        } catch (InterruptedException e) {  
            
        }  
        latch.countDown();  
    }  
  
    /** 
     * CountDownLatch 是并发包中提供的一个可用于控制多个线程同时开始某个动作的类，
     * 其采用的方式为减计数的方式，每次调用countDown()方法计数减一,
     * 当计数减至零时位于latch.await()后的代码才会被执行。 
     */  
    private static CountDownLatch latch = new CountDownLatch(10);  
  
    public static void main(String[] args) {  
        long start = System.currentTimeMillis();  
        int i = 0;  
        while (i < 10) {  
            i++;  
            new CountDownLatchTest().start();  
        }  
        try {  
            latch.await();  
        } catch (InterruptedException e) {  
            
        }  
        System.out.println("use time:" + (System.currentTimeMillis() - start));  
    }  
  
    
}  


