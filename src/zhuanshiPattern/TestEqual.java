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
public class TestEqual {

    public static void main(String[] args) throws Exception {
        String s1 = "nihao";
        String s2 = "nihao";
        String s3 = new String("nihao");
        System.out.println(s1 == s2);    //    true
        System.out.println(s1 == s3);    //    false
        System.out.println(s1.equals(s3)); 
    }
}