/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author zhengchao
 */
public class Map_sort {
    
    
    public static void main(String[] args){
        
        Map<String,String> map = new HashMap();
        map.put("A","@");
        map.put("W","@");
        map.put("E","@");
        map.put("Q","@");
        map.put("R","@");
        map.put("B","@");
        map.put("U","@");
        
        for(Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
        
        
        
        
        List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });

         System.out.println(list);
        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
           
         System.out.println(result);
        
        
    }
    
    
}
