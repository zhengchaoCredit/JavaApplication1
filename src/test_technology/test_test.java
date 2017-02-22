/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author zhengchao
 */
public class test_test {
    
    
    
    
    public static void main(String[] args) {
      
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1); //true
        String s2 = new StringBuilder("ja") .append("va").toString();
        System.out.println(s2.intern() == s2); //false
       
        
    }
    
    
}
