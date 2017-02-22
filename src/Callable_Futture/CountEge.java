/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Callable_Futture;

/**
 *
 * @author zhengchao
 */
public class CountEge {
    
    public static void main(String[] args){
        
        for(int i=0;i<100000;i++){
            if(i%2==1 && i%4==1 && i%5==4 &&i%6==3 &&i%7==0 &&i%8==1 &&i%9==0){
                System.out.println("这个数符合要求："+i);
            }
        }
    }
}
