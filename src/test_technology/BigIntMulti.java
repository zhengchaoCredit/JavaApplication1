/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

/**
 *
 * @author zhengchao
 */
public class BigIntMulti {
    
    public static void bigNumberSimpleMulti(String f, String s) {  
        
        // 将大数翻转并转换成字符数组  
        char[] a = new StringBuffer(f).reverse().toString().toCharArray();  
        char[] b = new StringBuffer(s).reverse().toString().toCharArray();  
        int lenA = a.length;  
        int lenB = b.length;  
        // 计算最终的最大长度  
        int len = lenA + lenB;  
        int[] result = new int[len];  
        // 计算结果集合  
        for (int i = 0; i < a.length; i++) {  
            for (int j = 0; j < b.length; j++) {  
                result[i + j] += (int) (a[i]) * (int) (b[j]);  
            }  
        }  
        // 处理结果集合，如果是大于10的就向前一位进位，本身进行除10取余  
        for (int i = 0; i < result.length; i++) {  
            if (result[i] > 10) {  
                result[i + 1] += result[i] / 10;  
                result[i] %= 10;  
            }  
        }  
        StringBuffer sb = new StringBuffer();  
        // 该字段用于标识是否有前置0，如果是0就不需要打印或者存储下来  
        boolean flag = true;  
        for (int i = len - 1; i >= 0; i--) {  
            if (result[i] == 0 && flag) {  
                continue;  
            } else {  
                flag = false;  
            }  
            sb.append(result[i]);  
        }  
        // 返回最终结果  
        System.out.println(sb.toString());  
    }  
    
    
    
}
