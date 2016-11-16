package IO_TEST;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjetStream_test {  
   public static void main(String[] args) {  
      ObjectOutputStream objectwriter=null;  
      ObjectInputStream objectreader=null;  
       
      try {  
         objectwriter=new ObjectOutputStream(new FileOutputStream("/Users/zhengchao/cctv/File_objectwriter_out.txt"));  
         objectwriter.writeObject(new Student("gg", 22));  
         objectwriter.writeObject(new Student("tt", 18));  
         objectwriter.writeObject(new Student("rr", 17));  
         objectreader=new ObjectInputStream(new FileInputStream("/Users/zhengchao/cctv/File_objectwriter_out.txt"));  
         for (int i = 0; i < 3; i++) {  
            System.out.println(objectreader.readObject());  
         }  
      } catch (IOException | ClassNotFoundException e) {  
         // TODO自动生成的 catch 块  
         e.printStackTrace();  
      }finally{  
         try {  
            objectreader.close();  
            objectwriter.close();  
         } catch (IOException e) {  
            // TODO自动生成的 catch 块  
            e.printStackTrace();  
         }  
      }  
   }  
}  
class Student implements Serializable{  
   private String name;  
   private int age;  
    
   public Student(String name, int age) {  
      super();  
      this.name = name;  
      this.age = age;  
   }  
   @Override  
   public String toString() {  
      return "Student [name=" + name + ", age=" + age + "]";  
   }  
}  