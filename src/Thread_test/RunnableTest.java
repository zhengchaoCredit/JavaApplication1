/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class RunnableTest implements Runnable{

    @Override
    public void run() {
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hello World!");
        
    }
    
    public static void main(String[] args){
        
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        thread.start();
        
        //加thread.join();会让程序等待thread执行完成，才继续执行下面的代码，如thread1
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RunnableTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Hello World!");

            }
        });
        thread1.start();
        
    }
    
    
}
