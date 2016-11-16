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
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputStream_test {
    public static void main(String[] args){
        int count = 0;
        InputStream streamReader = null;//文件输入流
        try {
            streamReader = new FileInputStream(new File("/Users/zhengchao/cctv/File_test.txt"));
            while(streamReader.read()!=-1) {  //读取文件字节，并递增指针到下一个字节  
             count++;  
          }  
          System.out.println("---长度是： "+count+" 字节");  
        } catch (IOException ex) {
            Logger.getLogger(InputStream_test.class.getName()).log(Level.SEVERE, null, ex);
        }finally{  
          try{  
             streamReader.close();//FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。 
          }catch (IOException e) {  
          }  
      }  
    }
}
