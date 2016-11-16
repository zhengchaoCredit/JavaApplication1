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
public class CangKu {
    
    private final LinkedList<Object> list;
    
    private static final int maxSize = 3;
    
    CangKu(LinkedList<Object> list){
        this.list = list;
    }
    
    private boolean isEmpty(){
        return list.size()==0;
    }
    
    private boolean isFull(){
        return list.size()==maxSize;
    }
    
    
    synchronized void produce() throws InterruptedException{
        
        while (isFull()) {  
            this.wait();  
        }  
        list.add("sdf"); 
        System.out.println("shengchangle ！");  
        this.notifyAll();  
    }
    
    synchronized void consumer() throws InterruptedException{
        while (isEmpty()) { 
           System.out.println("不能消费啊啊啊啊啊");  
           this.wait();  
        }  
        list.remove();  
        System.out.println("消费啊啊啊啊啊啊啊！");  
        this.notifyAll();  
    }
    
    //另外一种写法，同步代码块
    void produce1() throws InterruptedException{
        
        synchronized(list){
            while (isFull()) {  
                list.wait();  
            }  
            list.add("sdf"); 
            System.out.println("shengchangle ！");  
            list.notifyAll();  
        }
    }
    
    void consumer1() throws InterruptedException{
        synchronized(list){
            while (isEmpty()) {  
                list.wait();  
            }  
            list.remove();  
            System.out.println("消费啊啊啊啊啊啊啊！");  
            list.notifyAll();  
        }
    }
    
    
    
    
}
