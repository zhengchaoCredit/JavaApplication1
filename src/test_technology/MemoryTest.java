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
public class MemoryTest {  
      static class Data{  
          private int week;  
          private String name;  
          Data(int i, String s){  
              week = i;  
              name = s;  
          }  
      }  
       
     Data weeks[] = {  
             new Data(1,"monday"),  
             new Data(2,"Tuesday"),  
             new Data(3,"Wednesday"),  
             new Data(4,"Thursday"),  
             new Data(5,"Friday"),  
             new Data(6,"Saturday"),  
             new Data(7,"Sunday")  
     };  
       
     public static void main(String[] args) {  
         final int N = 20000;  
         MemoryTest test = null;  
         for (int i = 0; i <=N; i++) {  
             test = new MemoryTest();  
         }  
         System.out.println(test.weeks.length);  
     }  
 }  