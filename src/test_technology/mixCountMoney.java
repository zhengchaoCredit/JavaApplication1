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
public class mixCountMoney {
    
    public static void main(String[] args) {  
        
        
        int[] moneyKind = {50,20,10,5,2,1}; //存在的面值种类，我们假设已经从大到小排列
        
        int  money = 111;//需要找钱，从moneyKind选择，输出需要找的张数最小的个数
        
        System.out.println(mixNeedMoneyCount(moneyKind,money));
        
        
     }  
    
    
    public static int mixNeedMoneyCount(int[] moneyKind, int money){
        
        int count = 0; // 返回的个数
        for(int i=0;i<moneyKind.length;i++){
            
            while(money>=moneyKind[i]){
                count++;
                money-=moneyKind[i];
            }
        }
        return count;
    }
}
