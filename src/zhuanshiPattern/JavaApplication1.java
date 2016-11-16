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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Component component = new ConcreteDecorate1(new ConcreteDecorate2(new ConcreteComponent()));
        component.doSomething();
    }
    
}
