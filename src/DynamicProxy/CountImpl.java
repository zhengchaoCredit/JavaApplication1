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
public class CountImpl implements Count {  
  
    @Override  
    public void queryCount() {  
        System.out.println("查看账户方法...");  
  
    }  
  
    @Override  
    public void updateCount() {  
        System.out.println("修改账户方法...");  
  
    }  
  
}  