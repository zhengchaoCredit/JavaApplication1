/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DynamicProxy;

/**
 *
 * @author zhengchao
 */
public class CountTest {
     public static void main(String[] args) {  
        CountImpl countImpl = new CountImpl();    
        CountProxy countProxy = new CountProxy(countImpl);    
        //countProxy.updateCount();    
        countProxy.queryCount();   
  
    }  
    
}
