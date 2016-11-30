/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithm_database;

/**
 *  求子数组的最大累加和问题
 * @author zhengchao
 */
public class MaxTotal {
    
    
    
    public static void main(String[] args){
        
        
        int[] str = {1,-2,-2,-4,-3,-5,-6,-6,-7,-56,-1,-2};
       
        System.out.println(maxTotal(str)); 
    }
    
    
    public static int  maxTotal(int[] intStr){
        
        
        int max = Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<intStr.length;i++){
            
            cur+=intStr[i];
            if(max<cur){
                max = cur;
            }
            if(cur<0){
                cur = 0;
            }
        }
        return max;
    }
    
}
