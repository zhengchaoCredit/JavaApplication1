/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO_TEST;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author zhengchao
 */
public class OutputStream_test {
    public static void main(String[] args) {  
        byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小  
        int numberRead=0;  
        InputStream input=null;  
        OutputStream out =null;  
        try {  
           input = new FileInputStream("/Users/zhengchao/cctv/File_test.txt");  
           out = new FileOutputStream("/Users/zhengchao/cctv/File_test_out.txt"); //如果文件不存在会自动创建  
           //每次从INPUT中读取buffer大小的数据到buffer中
           while ((numberRead=input.read(buffer))!=-1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，  
              out.write(buffer, 0, numberRead);           //否则会自动被填充0  
           }  
        } catch (final IOException e) {  
            e.printStackTrace();  
        }finally{  
           try {  
              input.close();  
               out.close();  
           } catch (IOException e) {  
              e.printStackTrace();  
           }  
        }  
    }  
}
