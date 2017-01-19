/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author zhengchao
 */
public class TestAtomic{
    
  
    /** 
     * 相关方法列表 
     * @see AtomicReference#compareAndSet(Object, Object) 对比设置值，参数1：原始值，参数2：修改目标引用 
     * @see AtomicReference#getAndSet(Object) 将引用的目标修改为设置的参数，直到修改成功为止，返回修改前的引用 
     */  
    public final static AtomicReference<String>  ATOMIC_REFERENCE = new AtomicReference<>("");  
      
    public static void main(String[] args) {  
        for(int i = 0 ; i < 100 ; i++) { 
            
            new Thread() {  
                @Override
                public void run() {  
                  
                    if(ATOMIC_REFERENCE.compareAndSet(ATOMIC_REFERENCE.toString(), ATOMIC_REFERENCE.toString()+"#")) {  
                        System.out.println(ATOMIC_REFERENCE.toString());  
                    }  
                }  
            }.start();  
        }  
    }  
}  
   







