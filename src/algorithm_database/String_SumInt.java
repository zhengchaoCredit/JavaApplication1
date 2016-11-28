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
public class String_SumInt {
    
    public static void main(String[] args){
       
        String a = "as34asdf44asdf2adf112ad100000";
        System.out.println(sumStringInt(a)); 
    }
    
    
    public static int  sumStringInt(String str){
        
        if(str == null){
            return 0;
        }
        
        char[] charArr = str.toCharArray();
        int res = 0;  //总和
        int num = 0;
        int cur = 0;
        
        for(int i=0;i<charArr.length;i++){
            cur = charArr[i]-'0';
            if(cur<0 || cur>9){
                res+=num;
                num=0;
            } else {
                num = num*10+cur;
            }
            
        }
        res+=num;
        return res;
        
    }
    
    
}












