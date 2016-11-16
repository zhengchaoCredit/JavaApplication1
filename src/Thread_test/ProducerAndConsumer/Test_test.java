/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_test.ProducerAndConsumer;

import java.util.LinkedList;

/**
 *
 * @author zhengchao
 */
public class Test_test {
    
    public static void main(String[] args){
        
        LinkedList<Object> list = new LinkedList();
        CangKu cangKu = new CangKu(list);

        
        Runnable pro = new Producer(cangKu);
        Runnable pro1 = new Producer(cangKu);
        Runnable pro2 = new Producer(cangKu);
        Runnable pro3 = new Producer(cangKu);
        Runnable pro4 = new Producer(cangKu);
        Runnable pro5 = new Producer(cangKu);
        
        Runnable con = new Consumer(cangKu);
        Runnable con1 = new Consumer(cangKu);
        Runnable con2 = new Consumer(cangKu);
        Runnable con3 = new Consumer(cangKu);
        Runnable con4 = new Consumer(cangKu);
        Runnable con5 = new Consumer(cangKu);
        
        
        new Thread(pro).start();
        new Thread(con).start();
        new Thread(pro1).start();
        new Thread(con1).start();
        new Thread(pro2).start();
        new Thread(con2).start();
        new Thread(pro3).start();
        new Thread(con3).start();
        new Thread(pro4).start();
        new Thread(con4).start();
        new Thread(pro5).start();
        new Thread(con5).start();

    }
    
    
    
}
