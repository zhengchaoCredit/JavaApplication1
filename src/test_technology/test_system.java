/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.util.Map;

/**
 *
 * @author zhengchao
 */
public class test_system {
    
    
    public static void main(String[] args){
        
        for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) { 
                        System.out.println(entry.getKey()+"\t"+entry.getValue()); 
        }
        
    }
    
}
