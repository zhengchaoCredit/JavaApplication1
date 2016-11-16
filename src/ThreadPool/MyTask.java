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

class MyTask implements Runnable {
        
        private int taskNum;  
  
        public MyTask(int taskNum) {  
            this.taskNum = taskNum;  
        }  

        @Override
        public void run() {  
            System.out.println("正在执行task " + taskNum);  
            try {  
                Thread.currentThread().sleep(4000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            System.out.println("task " + taskNum + "执行完毕");  
        }  

        public int getTaskNum() {  
            return taskNum;  
        }  

        public void setTaskNum(int taskNum) {  
            this.taskNum = taskNum;  
        }  
    }  