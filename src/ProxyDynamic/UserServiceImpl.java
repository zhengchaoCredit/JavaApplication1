/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProxyDynamic;

/** 
 * 目标对象 
 * @author zyb 
 * @since 2012-8-9 
 * 
 */  
public class UserServiceImpl implements UserService {  
  
    /* (non-Javadoc) 
     * @see dynamic.proxy.UserService#add() 
     */  
    public void add() {  
        System.out.println("--------------------add---------------");  
    }  
}  
