/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author zhengchao
 */
public class Map2List {
    
    
    
    public static void main(String[] args){
        
        
//        Map<String,String> map = new HashMap();
//        map.put("1", "a");
//        map.put("2", "b");
//        map.put("3", "c");
//        
//        // key list
//        List keyList = new ArrayList(map.keySet());
//        System.out.println("####"+keyList);
//        
//        // value list
//        List valueList = new ArrayList(map.values());
//        System.out.println("####"+valueList);
//        
//        // key-value list
//        List entryList = new ArrayList(map.entrySet());
//        System.out.println("####"+entryList);
//        
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            
//            entry.getKey();
//                    
//        }
        
        
        
       List list0 = new ArrayList();
       list0.add(new Apple("red", Color.RED,13));
       list0.add(new Apple("red", Color.RED,1));
       list0.add(new Apple("red", Color.RED,2));
       Collections.sort(list0);
       
       //或者这种方式
       Collections.sort(list0, new Comparator<Apple>(){
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }
    
    
    
}
