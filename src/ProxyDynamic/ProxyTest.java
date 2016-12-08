/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProxyDynamic;

/** 
 * 动态代理测试类 
 * @author zyb 
 * @since 2012-8-9 
 * 
 */  
public class ProxyTest {  
  
    public  static void main(String[] args) throws Throwable {  
        // 实例化目标对象  
        UserService userService = new UserServiceImpl();  
          
        // 实例化InvocationHandler  
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);  
          
        // 根据目标对象生成代理对象  
        UserService proxy = (UserService) invocationHandler.getProxy();  
          
        // 调用代理对象的方法  
        proxy.add();  
          
    }  
}  

