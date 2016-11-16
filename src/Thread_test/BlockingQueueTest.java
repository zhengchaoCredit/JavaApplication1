/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class BlockingQueueTest {
    
    
    private final int size = 20;
    private final ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(size);//基于数组的并发阻塞队列
    
    public static void main(String[] args) {
        BlockingQueueTest test = new BlockingQueueTest(); 
        Producer producer = test.new Producer(); 
        Consumer consumer = test.new Consumer(); 
        producer.start(); 
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BlockingQueueTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        consumer.start(); 
    } 
    
    
    

    class Consumer extends Thread{ 
        @Override 
        public void run() { 
            while(true){ 
                try { 
                    //从阻塞队列中取出一个元素 
                    blockingQueue.take(); 
                    System.out.println("队列剩余" + blockingQueue.size() + "个元素"); 
                } catch (InterruptedException e) { 
                } 
            } 
        } 
    } 

    class Producer extends Thread{ 
        @Override 
        public void run() { 
            while (true) { 
                try { 
                    //向阻塞队列中插入一个元素 
                    blockingQueue.put(1); 
                    System.out.println("队列剩余空间####################################：" + (size - blockingQueue.size())); 
                } catch (InterruptedException e) { 
                } 
            } 
        } 
     }
}
