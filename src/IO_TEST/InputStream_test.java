/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO_TEST;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStream_test {
    public static void main(String[] args){
        InputStream fin = null;//文件输入流
        try {
            
            StringBuffer sb = new StringBuffer();
            fin = new FileInputStream(new File("/Users/zhengchao/cctv/File_test.txt"));
            int x;
            while((x = fin.read())!=-1) {  //读取文件字节，并递增指针到下一个字节  
                sb.append(x);
             }     
            System.out.println("sb是： "+sb);  
        } catch (IOException ex) {
      }  
    }
}
