/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_duotai;

public class Cat extends Animal{
    
    String food;  //Cat定义了自己的属性:食物
    
    public Cat(String food,int age ,String name){  
        super(name,age);
        this.food = food;
    }
    
    //重写了父类的showInfo()方法，
    @Override
    public void showInfo(){
        System.out.println(food+name+age);
    }
    
    
}
