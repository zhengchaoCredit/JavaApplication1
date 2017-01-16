/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflect;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhengchao
 */
public class testMapToObject {
    
    public static void main(String[] args){
        
        //假设有一个Map存放了一个对象的姓名和年龄
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", "Kobi");
        map.put("age", 39);
        
        User user = transferMapToUser(map,User.class);
        
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
    
    public static <T> T transferMapToUser(Map<String,Object> map,Class<T> classT){
        try {
            return transfer(map,classT.newInstance());
        } catch (InstantiationException ex) {
            System.out.println("what the fuck?");
        } catch (IllegalAccessException ex) {
            System.out.println("what the fuck?");
        }
        return null;
    }
    
    public static <T> T transfer(Map<String,Object> map,Object obj){
        
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                if (map.containsKey(key)) {
                    Object value = map.get(key);
                    // 得到property对应的setter方法
                    Method setter = property.getWriteMethod();
                    try {
                        setter.invoke(obj, value);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("what the fuck?");
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("what the fuck?");
        }

        return (T) obj;
    }
    
}
