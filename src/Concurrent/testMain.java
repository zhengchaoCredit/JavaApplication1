/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author zhengchao
 */
public class testMain {
    
     public static void main(String[] args) throws ExecutionException, InterruptedException{
         
         
         long start = System.currentTimeMillis();
         ForkJoinPool forkJoinPool = new ForkJoinPool(); 
         
         Future<Long> result = forkJoinPool.submit(new CalculatorFork_Join(0, 1000000));  
         System.out.println("ForkJoinCostTime:"+(System.currentTimeMillis()-start));
         System.out.println(result.get());
         
         start = System.currentTimeMillis();
         long sum = 0;
         for(int i=0;i<=1000000;i++){
             sum+=i;
         }
         System.out.println("CostTime:"+(System.currentTimeMillis()-start));
         System.out.println(sum);
         forkJoinPool.shutdown();
             
     }
}