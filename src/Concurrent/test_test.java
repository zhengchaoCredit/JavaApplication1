/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author zhengchao
 */
public class test_test {
    
     public static void main(String[] args){
         
         
         ExecutorService executorService = Executors.newSingleThreadExecutor();  
         Future future = executorService.submit(new Runnable(){
             
             @Override
             public void run(){
                 
             }
             
         });
         
         Future futreu = executorService.submit(new Callable(){
             
             @Override
             public String call(){
                 return "";
             }
         });
         
         
         
        testtest test = new testtest(0);
        
       
       for(int i=0;i<100;i++){
           new Thread(test).start();
           //System.out.println("****"+i);
       }
        
        
        
    }
    
}
