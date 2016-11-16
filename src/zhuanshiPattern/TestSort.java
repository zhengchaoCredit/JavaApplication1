/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zhuanshiPattern;

/**
 *
 * @author zhengchao
 */
public class TestSort {
    public static void main(String[] args) {
        int[] a = {9, 1, 5, 2, 4, 8};
        //冒泡排序
        for(int i=0;i<a.length-1;i++){     //每次产生一个最大或最小的数，共需要执行n-1次
            for(int j=0;j<a.length-1-i;j++){   //每执行一轮，第二轮就会少处理一个数据，因此是n-i-1
                if(a[j]>a[j+1]){  
                    int temp=a[j];  
                    a[j]=a[j+1];  
                    a[j+1]=temp;  
                }  
            }  
        }  
    }
}
