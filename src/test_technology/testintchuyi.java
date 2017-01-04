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
         String x = "15487834A64E2D91EFC94EF2367^1.00^INIT^20161230144930^20161230144930";
         
         String[] result= x.split("\\^");
        
                         
        System.out.println(result[2]);
    }
    
}
