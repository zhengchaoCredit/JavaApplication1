/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreadPool;

/**
 *
 * @author zhengchao
 */
public class TestThreadPool {
    
    
    public static void main(String[] args){
        
        
        ThreadPoolManager threadPoolManager = ThreadPoolManager.getInstance();
        
        
        for (int i = 0; i < 100; i++) {  
            threadPoolManager.addTask(new MyTask(i));  
            System.out.println("线程池中线程数目：" + threadPoolManager.getPoolSize() + "，队列中等待执行的任务数目："  
                    + threadPoolManager.getQueueSize() + "，已执行玩别的任务数目：" + threadPoolManager.getCompletedTaskCount());  
        }  
        threadPoolManager.shutdown();  
        
    }
    
}
