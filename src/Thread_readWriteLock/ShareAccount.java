/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_readWriteLock;

/**
 *
 * @author zhengchao
 */
public class ShareAccount {
    
    private String oid;         //账号  
    
    private int cash;             //账户余额  

    ShareAccount(String oid, int cash) {  
        this.oid = oid;  
        this.cash = cash;  
    }  

    public String getOid() {  
       return oid;  
    }  

    public void setOid(String oid) {  
        this.oid = oid;  
    }  

    public int getCash() {  
        return cash;  
    }  

    public void setCash(int cash) {  
        this.cash = cash;  
    }  

    @Override  
    public String toString() {  
        return "MyCount{" +  
                "oid='" + oid + '\'' +  
                ", cash=" + cash +  
                '}';  
    }
    
    
}
