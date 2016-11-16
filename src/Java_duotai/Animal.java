package Java_duotai;

/**
 *
 * @author zhengchao
 */
public class Animal {
    
    String name;
    int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void showInfo(){
        System.out.println("父类Animal说:我是周杰伦");
    }
    
}
