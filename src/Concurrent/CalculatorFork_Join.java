/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author zhengchao
 */
public class CalculatorFork_Join extends RecursiveTask<Long> {  
    
    private int start;
    private int end;
    CalculatorFork_Join(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    protected Long compute() {
        long sum =0;
        if((end - start) < 10000){    
            for(int i = start; i<= end;i++){    
                sum += i;    
            }  
            return sum;
        }else {
            CalculatorFork_Join left = new CalculatorFork_Join(start, (start+end)/2);
            CalculatorFork_Join right = new CalculatorFork_Join((start+end)/2+1, end);
            left.fork();
            right.fork();
            sum = left.join()+right.join();
            return sum;
        }
    }
    
    
    
  
    

  
}  