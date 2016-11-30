/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author zhengchao
 */
public class Map_Entry {
    
    public static void main(String[] args){
        
        Map<String ,String> map = new HashMap();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        
        for(Map.Entry<String, String> x:map.entrySet()){
            
            System.out.println("key:"+x.getKey()+"   "+"value:"+x.getValue());  
        }
        
        
        
    }
    
    
    
}
