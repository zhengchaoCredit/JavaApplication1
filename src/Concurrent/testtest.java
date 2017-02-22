/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class testtest implements Runnable{
    
    public int x;
    
    private static final String str="test";
    
    ReadWriteLock readwriteLock  = new ReentrantReadWriteLock();
    
    
    public testtest(int x){
        this.x = x;
    }

    @Override
    public void run() {
        
        readwriteLock.readLock().lock();
        
        readwriteLock.readLock().unlock();
        
        readwriteLock.writeLock().lock();
        
        readwriteLock.writeLock().unlock();
        
        synchronized(str){
            try {
                Thread.sleep(1);
                x++;
                System.out.println(x);
            } catch (InterruptedException ex) {
                Logger.getLogger(testtest.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    
}
    

