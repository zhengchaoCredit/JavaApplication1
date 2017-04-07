/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nio.test;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.nio.ByteBuffer;  
import java.nio.channels.FileChannel;  
  
public class CopyFile_1 {  
    public static void main(String[] args) throws Exception {  
        String infile = "/var/CreditCloud/DeviceManagerConfig.xml";  
        String outfile = "/var/CreditCloud/DeviceManagerConfig1.xml";  
        // 获取源文件和目标文件的输入输出流  
        FileInputStream fin = new FileInputStream(infile);  
        FileOutputStream fout = new FileOutputStream(outfile);  
        // 获取输入输出通道  
        FileChannel fcin = fin.getChannel();  
        FileChannel fcout = fout.getChannel();  
        // 创建缓冲区  
        ByteBuffer buffer = ByteBuffer.allocate(1024);  
        while (true) {  
            // clear方法重设缓冲区，使它可以接受读入的数据  
            buffer.clear();  
            // 从输入通道中将数据读到缓冲区  
            int r = fcin.read(buffer);  
            // read方法返回读取的字节数，可能为零，如果该通道已到达流的末尾，则返回-1  
            if (r == -1) {  
                break;  
            }  
            // flip方法让缓冲区可以将新读入的数据写入另一个通道  
            buffer.flip();  //写模式转换成读模式
            // 从输出通道中将数据写入缓冲区  
            fcout.write(buffer);  
        }  
    }  
}  


//阻塞式网络 IO 的特点：
//多线程处理多个连接。每个线程拥有自己的栈空间并且占用一些 CPU 时间。
//每个线程遇到外部为准备好的时候，都会阻塞掉。阻塞的结果就是会带来大量的进程上下文切换。
//且大部分进程上下文切换可能是无意义的。
//比如假设一个线程监听一个端口，一天只会有几次请求进来，
//但是该 cpu 不得不为该线程不断做上下文切换尝试，大部分的切换以阻塞告终。