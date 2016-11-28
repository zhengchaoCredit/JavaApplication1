package algorithm_database;

/**
 * 交换两个整数，不使用任何额外的变量
 */
public class ChangeTwoInteger {
    
    public static void main(String[] args){
        
        int a = 4;  //4就是0100
        int b = 9;  //9就是1001
        
        a = a^b;    //a就是1101  现在异或的结果1101就代表a和b的位不同的信息，这样写是因为算法实现有要求，不能用额外变量，否则用int c = a^b会好理解一点。
        b = a^b;    //b就是0100  为4，其实就是变成了当初的a
        a = a^b;    //a就是1001  为9，其实就是用b(即当初的a)异或1101得到最终的a（即当初的b）
        
        System.out.println(a);
        System.out.println(b);
        
        
    }
    
    
}
