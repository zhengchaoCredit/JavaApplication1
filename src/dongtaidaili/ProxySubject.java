/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy类的代码量被固定下来，不会因为业务的逐渐庞大而庞大；
   可以实现AOP编程，实际上静态代理也可以实现，总的来说，AOP可以算作是代理模式的一个典型应用；
   解耦，通过参数就可以判断真实类，不需要事先实例化，更加灵活多变。
 * @author zhengchao
 */
public class ProxySubject implements InvocationHandler{
    
    private Object target;  
      
    public ProxySubject(Object target) {  
        super();  
        this.target = target;  
    } 
    
    public Object getProxy() {  
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  
                                      target.getClass().getInterfaces(),  
                                      this);  
    }  

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        Object result = null;  
        
        //这里就可以进行所谓的AOP编程了  
        System.out.println("~~~first buy an apple~");
        
        //在调用具体函数方法前，执行功能处理  
        result = method.invoke(target,args);  
       
        //在调用具体函数方法后，执行功能处理  
        System.out.println("~~~apple eat finish~");
        
        return result; 
        
    }
    
    public static void main(String[] args){
        ProxySubject proxy = new ProxySubject(new SubjectImpl());  
        //绑定该类实现的所有接口  
        Subject sub = (Subject) proxy.getProxy();  
        sub.eat();
        
        
    }
    
    
    
}
