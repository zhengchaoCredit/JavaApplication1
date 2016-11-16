/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO_TEST;
import java.io.*;  
/**
 *
 * @author zhengchao
 */
public class BufferOutputStream_test {
    
    public static void main(String[] args) {   
        
        try {   
            byte[] data = new byte[1];   
  
            File srcFile = new File(args[0]);   
            File desFile = new File(args[1]);   
  
            BufferedInputStream bufferedInputStream =    
                new BufferedInputStream(new FileInputStream(srcFile));   
  
            BufferedOutputStream bufferedOutputStream =    
                new BufferedOutputStream(new FileOutputStream(desFile));   
  
            System.out.println("复制文件："+srcFile.length()+"字节");   
  
            while(bufferedInputStream.read(data)!=-1) {   
                bufferedOutputStream.write(data);   
            }   
  
            //将缓冲区中的数据全部写出   
            bufferedOutputStream.flush();   
  
            //关闭流   
            bufferedInputStream.close();   
            bufferedOutputStream.close();   
  
            System.out.println("复制完成");   
        } catch(ArrayIndexOutOfBoundsException e)  {   
            System.out.println("using:java UseFileStream src des");   
            e.printStackTrace();   
        }   catch(IOException e) {   
            e.printStackTrace();   
        }   
    }   
};  