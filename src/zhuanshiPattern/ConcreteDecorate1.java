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
public class ConcreteDecorate1 extends Decorate{

   public ConcreteDecorate1(Component component){
      super(component);
   }

   @Override
   public void doSomething(){
      super.doSomething();
      this.doAnotherDosomething();
   }

   private void doAnotherDosomething(){
      System.out.println("功能B");
   }

}


