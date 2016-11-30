/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflect;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Class c=Class.forName("java.util.HashMap");
            Object o=c.newInstance();
            Method[] methods=c.getDeclaredMethods();
            for(Method method:methods){
                System.out.println(method);
            }
            
            
            Method m1=c.getMethod("put", Object.class,Object.class);
            for(int i =0;i<3;i++){
                System.out.println("*****************");
            }
            m1.invoke(o, "name","zhengchao");
            m1.invoke(o, "age",26);
            
            System.out.println(o);
            
            
    }
}