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
public class SwitchCase   
{  
    public static int switchCase(int number)  
    {  
        int sum = 0;  
        switch(number)  
        {  
            case 1:  
                sum = sum + number;  
            case 2:  
                sum = sum + number*2;  
            case 3:  
                sum = sum + number*3;  
            case 4:  
                sum = sum + number*4;  
        }  
          
        return sum;  
    }  
      
    /** 
     *  
     * 方法名：main 
     * 方法类型：SwitchCase 
     * 参数：@param args 
     * @return ：void 
     * @throws 
     */  
    public static void main(String[] args)   
    {  
        int sum = 0; 
        int number = 2;
        switch(number){  
            case 1:  
                sum = sum + number;  
                break;
            case 2:  
                sum = sum + number*2; 
                break;
            case 3:  
                sum = sum + number*3; 
                break;
            case 4:  
                sum = sum + number*4;  
                break;
        }  
        System.out.println(sum);
    }  
  
}  

