package algorithm_database;
/**
 *  给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，
 *  那么str1和str2互为变形词。
 */
public class IsBianxingci {
    
    public static void main(String[] args){
        String a = "123444";
        String b = "344421";
        System.out.println(bianxingci(a,b)); 
        int aaaa = '就';
        System.out.println(aaaa); 
    }
    
    
    public static boolean bianxingci(String a, String b){
        
        char[] chas1 = a.toCharArray();
        char[] chas2 = b.toCharArray();
        int[] map = new int[256];
        if(chas1.length!=chas2.length){
            return false;
        }
        
        for(int i=0;i<chas1.length;i++){
            map[chas1[i]]++;
        }
        
        for(int i=0;i<chas2.length;i++){
            if(map[chas2[i]]==0){
                return false;
            }
            map[chas2[i]]--;
        }
        
        return true;
    }
}








