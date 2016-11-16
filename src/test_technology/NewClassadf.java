/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author zhengchao
 */
public class NewClassadf {
    
    public static void main(String[] args){
        
        try{
            System.out.println("asdfasdf");
            File file = new File("");
            System.exit(0);
        }catch(Exception ex){
            System.out.printf("RRR");
        } finally{
            System.out.printf("EEEE");
        }
        
    }
    
}
