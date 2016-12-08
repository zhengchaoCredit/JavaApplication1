/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflect;

/**
 *
 * @author zhengchao
 */
public class test {
    
    String name;
    
    public void test(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
