/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author zhengchao
 */
public class ThreadTest_03 implements Runnable{
    
    BlockingQueue<String> queue =  new ArrayBlockingQueue<String>(10);
    HashMap map = new HashMap();
    Hashtable hashtable = new Hashtable();
    
    
    BlockingQueue que = new LinkedBlockingQueue();
    
    private StringBuffer lock;
    
    private String name;
    
    public ThreadTest_03(String name, StringBuffer lock){
        this.name = name;
        this.lock = lock;
    }
    
    @Override
    public void run(){
        synchronized(lock){
            System.out.println(name+"run...."+lock);
            lock = lock.append("test");
            System.out.println("lock="+lock);
        }
    }
    
    public static void main(String[] args){
        ThreadTest_03 thread03 =  new ThreadTest_03("thread1",new StringBuffer("test"));
        Thread thread1 = new Thread(thread03);
        Thread thread2 = new Thread(thread03);
        Thread thread3 = new Thread(thread03);
        thread1.start();
        thread2.start();
        thread3.start();
        
        
    }
    
}
