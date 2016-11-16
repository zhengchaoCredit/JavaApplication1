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
public class ThreadTest  extends Thread{
    
    private static int seconds =3000;
    
    @Override
    public void run(){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args){
        
        Thread thread = new ThreadTest();
        thread.start();
    }
    
}
