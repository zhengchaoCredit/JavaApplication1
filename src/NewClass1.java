import java.lang.reflect.Method;
import java.util.HashMap;
/**
 *
 * @author zhengchao
 */
public class NewClass1 {
    
    private void method1(){
        
    }
    
    public void method2(){
    
    }
     
    public void method3(){}
    
    
    public class NewClass2 extends NewClass1{
        
        
        private void method1(){
        
        }
        
        @Override
        public void method2(){
    
        }
        
    }
    
    
    public static void main(String[] args){
        
        HashMap map;
        
        Method[] method = NewClass1.class.getDeclaredMethods();
        
        for(int i=0 ; i<method.length; i++){
            System.out.println(method[i]);
        }
        
         System.out.println("*******************************************************");
        
        Method[] method1 = NewClass1.class.getMethods();
        
        for(int i=0 ; i<method1.length; i++){
            System.out.println(method1[i]);
        }
        
        
    
    }
    
    
    
    
}
