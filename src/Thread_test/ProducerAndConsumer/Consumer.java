/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_test.ProducerAndConsumer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class Consumer implements Runnable{
   private CangKu cangKu;  
    
    Consumer(CangKu cangKu){
        this.cangKu = cangKu;
    }

    @Override
    public void run() {
       try {
           cangKu.consumer();
           //cangKu.consumer1();
       } catch (InterruptedException ex) {
           Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
}
