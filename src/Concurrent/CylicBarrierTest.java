package Concurrent;
import java.util.concurrent.BrokenBarrierException;  
import java.util.concurrent.CyclicBarrier;  
import java.util.concurrent.TimeUnit;  
import java.util.concurrent.TimeoutException;  

/**
 *
 * @author zhengchao
 */
public class CylicBarrierTest extends Thread{
  
    /** 
     * CyclicBarrier 和CountDownLatch不同，CyclicBarrier是当await 的数量达到了设置的数量后， 
     * 才继续往下执行 
     */  
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);  
    private int id;  
  
    public CylicBarrierTest(int id) {  
        this.id = id;  
    }  
  
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {  
        int i = 0;  
        while (i < 4) {  
            i++;  
            new CylicBarrierTest(i).start();  
        }  
        
        cyclicBarrier.await();
        System.out.println("我去，终于到我了！");  
        
    }  
  
    public void run() {  
        try {  
            System.out.println("#########" + id);  
            cyclicBarrier.await();  
            System.out.println("*********:" + id);  
        } catch (InterruptedException e1) {  
        } catch (BrokenBarrierException e) {  
        }  
    }  
}