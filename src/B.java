
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class B {
  
    
    public static void main(String[] args){
        
        Set<String> set = new HashSet();
        
        set.add("zhengchao");
        set.add("liuzhen");
        
        List<String> list = new ArrayList();
        list.add("zheng");
        list.add("liu");
        list.add("liuzhen");
        int i = 0;
        for(String str :list){
            i++;
            if(set.contains(str)){
                System.out.println(str);
                System.out.println(i);
            }
            
        }
       
    }
   
}
