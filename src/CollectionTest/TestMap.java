package CollectionTest;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhengchao
 */
public class TestMap {
     public static void main(String[] args){
        Set<String> set = new HashSet();
        set.add("av");
        set.add("bv");
        set.add("cv");
        set.add("av");
        set.add("ev");
        set.add("dv");
        for(String str:set){
            System.out.println(str);
        }
        
    }
}
