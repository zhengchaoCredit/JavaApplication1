/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithm_database;

/**
 *
 * @author zhengchao
 */
public class findTheOnly {
    
    public static void main(String[] args){
        
        int[] intStr = {1,2,3,4,5,4,3,2,1};
        System.out.println(findYOU(intStr));
        
    }
    
    public static int findYOU(int[] intStr){
        int ee = 0;
        for(int i=0;i<intStr.length;i++){
            ee^=intStr[i];
        }
        return ee;
    }
    
}
