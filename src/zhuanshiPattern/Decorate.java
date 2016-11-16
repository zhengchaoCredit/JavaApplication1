/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zhuanshiPattern;

/**
 *
 * @author zhengchao
 */
public class Decorate implements Component{

   private Component component;

   public Decorate(Component component){
      this.component = component;
   }

   @Override
   public void doSomething(){
      component.doSomething();
   }
}
