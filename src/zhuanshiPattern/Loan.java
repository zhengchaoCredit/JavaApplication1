/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zhuanshiPattern;

import java.util.Date;
public class Loan {
    Date date;
    int amount;
    
    Loan(Date date,int amount){
        this.date = date;
        this.amount = amount;
        
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public int amount(){
        return this.amount;
    }
    
    
    
}
