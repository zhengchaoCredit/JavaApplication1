


package Thread_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class TestLock_right {  //加锁的错误掩饰
    
    private Lock lock = new ReentrantLock();
    private static int size = 20;
    
    public static void main(String[] args) {
        
        TestLock_right test = new TestLock_right(); 
        Producer producer = test.new Producer(); 
        producer.start(); 
        for(int i=0;i<100;i++){
            test.new Consumer().start();
        }
        
     
    } 
    
    class Consumer extends Thread{ 
        @Override 
        public void run() { 
            while(true){ 
                lock.lock();
                try {
                    if(size>0){
                        size--;
                    }
                } finally {
                    lock.unlock();
                }
                System.out.println(size);
            } 
        } 
    } 

    class Producer extends Thread{ 
        @Override 
        public void run() { 
            while (true) { 
                lock.lock();
                try {
                    Thread.sleep(200);
                    if(size<20){
                        size++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestLock_wrong.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    lock.unlock();
                }
                System.out.println(size);
            } 
        } 
     }
}

