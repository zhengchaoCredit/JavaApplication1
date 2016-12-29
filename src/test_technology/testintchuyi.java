/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zhengchao
 */
public class testintchuyi {
    
    
     public static void main(String[] args) {
         Date date = new Date();
         
         
         SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  
        String tim = sdf.format(date);  
        
                         
        System.out.println(tim);
    }
    
}
