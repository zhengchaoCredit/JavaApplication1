/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithm_database;

/**
 *   32位的整数的二进制表达式中，统计其中1的个数
 * @author zhengchao
 */
public class CountOne {
    
     public static void main(String[] args){
         
         int  x =-1;
         System.out.println("1的个数"+count1(x));
     }
     
     public static int count1(int x){
         
         int res = 0;
         while(x!=0){
             res+=x&1;  //&操作，都是1才为1，其他都是0
             x>>>=1;    //无符号右移一位，不能用x>>=1，这是一个死循环，见下面三个位运算符的解释
         }
         return res;
     }
    
}
/*
   << :左移运算符，num<<1，相当于num*2；

   >>:右移运算符，num>>1，相当于num/2；

   >>>:无符号右移，忽略符号位，空位以0补齐。
*/
