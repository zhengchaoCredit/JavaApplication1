/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zhuanshiPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * Collections.sort方法
 */
public class TestCollections {
    
    public static void sort(List<Loan> list){
        
        for(Loan loan:list){
            System.out.println(loan.getDate().getTime());
        }
        System.out.println("*******************");
        Collections.sort(list, new Comparator<Loan>()  {
            @Override
            public int compare(Loan o1, Loan o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        for(Loan loan:list){
            System.out.println(loan.getDate().getTime());
        }
        
    }
    
    public static void main(String[] args){
        List list = new ArrayList();
        Random ram = new Random();
        for(int i=0;i<5;i++){
            list.add(new Loan(new Date(ram.nextInt(100)),10000));
        }
        sort(list);
    }
}
