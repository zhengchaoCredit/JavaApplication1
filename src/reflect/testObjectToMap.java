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
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author zhengchao
 */
public class testObjectToMap {
    
    public static void main(String[] args){
        User user = new User();
        user.setName("Kobi");
        user.setAge(39);
        
        Map<String, Object>  map = transBean2Map(user);
        System.out.println(map);
        
    }
    
    
    
    
    
    public static  Map<String, Object> transBean2Map(Object obj) {

        if (obj == null) {
            return null;
        }
        TreeMap<String, Object> map = new TreeMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (key.equals("class")) {
                    continue;
                }
                
                // 得到property对应的getter方法
                Method getter = property.getReadMethod();
                Object value = getter.invoke(obj);
                
                map.put(key, value);
            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }

        return map;
    }
    
}
