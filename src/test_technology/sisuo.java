/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

/**
 *
 * @author zhengchao
 */
public class sisuo {
     
    public void run() {
        MyThread mt = new MyThread();
        new Thread(mt, "张三").start();
        new Thread(mt, "李四").start();
    }
     
    class MyThread implements Runnable {
        private Object o1 = new Object();
        private Object o2 = new Object();
        private boolean flag = true;
         
 
        @Override
        public void run() {
            if (flag) {
                System.out.println(Thread.currentThread().getName() + "__"+flag);
                flag = false;
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " have o1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o2) {
                        System.out.println(Thread.currentThread().getName() + " have o2");
                    }
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "__"+flag);
                flag = true;
                
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " have o2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o1) {
                        System.out.println(Thread.currentThread().getName() + " have o1");
                    }
                }
            }
        }
    }
     
    public static void main(String[] args) {
        new sisuo().run();
    }
}