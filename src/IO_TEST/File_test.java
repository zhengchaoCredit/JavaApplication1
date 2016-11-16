/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO_TEST;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class File_test {
    
    
    public static void createFile(){
        File f = new File("/Users/zhengchao/cctv/File_test.txt");//当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。  
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(File_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("文件名  "+f.getName());  //返回由此抽象路径名表示的文件或目录的名称。  
        System.out.println("文件父目录字符串 "+f.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。 
        //f.delete();  //删除创建的文件
    }
    
    public static void main(String[] args){
        createFile();
        
    }
    
}
