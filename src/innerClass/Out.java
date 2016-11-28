/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerClass;

import java.math.BigDecimal;

/**
 *
 * @author zhengchao
 */
class Out1 {   
     private int age;   

     class In {   
         private int age;   
         public void print() {   
             int age = 0;   
             System.out.println("局部变量：" + age);   
             System.out.println("内部类变量：" + this.age);   
             System.out.println("外部类变量：" + Out1.this.age);   
         }   
     }   
 }   

 public class Out {   
     public static void main(String[] args) {   
         Out1.In in = new Out1().new In();   
         in.print();   
     }   
 }