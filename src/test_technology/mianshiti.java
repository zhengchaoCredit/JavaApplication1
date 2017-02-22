/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class mianshiti {
    
    public static void main(String[] args){
        int a = 10;
        method(a);
        System.out.println("a="+Integer.valueOf(a));
    }
    
    public static void method(Integer a){
        
        try {
            Field field = a.getClass().getDeclaredField("value");
            field.setAccessible(true);
            try {
                field.setInt(a, 200);
                System.out.println("aa="+Integer.valueOf(a.intValue()));
            } catch (IllegalArgumentException ex) {
            } catch (IllegalAccessException ex) {
            }
        } catch (NoSuchFieldException ex) {
        } catch (SecurityException ex) {
        }
        
    }
    
}
