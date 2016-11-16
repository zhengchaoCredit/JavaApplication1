

package Thread_test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class TestLock_wrong {  //不加锁的错误掩饰：size会为负的
    
    
    private static int size = 20;
    
    public static void main(String[] args) {
        
        TestLock_wrong test = new TestLock_wrong(); 
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
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestLock_wrong.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(size>0){//虽然加了限制，但是多个消费者一起工作时，还是无法保证唯一正确
                    size--;
                }
                System.out.println(size);
            } 
        } 
    } 

    class Producer extends Thread{ 
        @Override 
        public void run() { 
            while (true) { 
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestLock_wrong.class.getName()).log(Level.SEVERE, null, ex);
                }
               if(size<20){
                    size++;
                }
                System.out.println(size);
            } 
        } 
     }
}

