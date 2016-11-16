/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread_readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhengchao
 */
public class User implements Runnable{
    
    
    private String name;                 //用户名  
    private ShareAccount myCount;        //所要操作的账户  
    private int iocash;                 //操作的金额，当然有正负之分了  
    private ReadWriteLock myLock;       //执行操作所需的锁对象  
    private boolean isQuery;         //是否查询  

    User(String name, ShareAccount myCount, int iocash, ReadWriteLock myLock, boolean isQuery) {  
        this.name = name;  
        this.myCount = myCount;  
        this.iocash = iocash;  
        this.myLock = myLock;  
        this.isQuery = isQuery;  
    }  

    //加Thread.sleep(1000);是为了让大家看运行结果，感受：可同时读
    public void run() {  
        if (isQuery) {  
            //获取读锁  
            myLock.readLock().lock();  
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("读：" + name + "正在查询" + myCount + "账户，当前金额为" + myCount.getCash());  
            //释放读锁  
            myLock.readLock().unlock();  
        } else {  
            //获取写锁  
            myLock.writeLock().lock();  
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            //执行现金业务
            System.out.println("写：" + name + "正在操作" + myCount + "账户，金额为" + iocash +"，当前金额为" + myCount.getCash());  
            myCount.setCash(myCount.getCash() + iocash);  
            System.out.println("写：" + name + "操作" + myCount + "账户成功，金额为" + iocash +"，当前金额为" + myCount.getCash());  
            //释放写锁  
            myLock.writeLock().unlock();  
        }  
    }  
    
}
