/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_test.ProducerAndConsumer;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class Producer implements Runnable{
    
    private CangKu cangKu;  
    
    Producer(CangKu cangKu){
        this.cangKu = cangKu;
    }

    @Override
    public void run() {
        try {
            cangKu.produce();
            //cangKu.produce1();
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
