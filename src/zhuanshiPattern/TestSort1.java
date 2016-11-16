/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zhuanshiPattern;

public class TestSort1 {
    public static void main(String[] args) {
        
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
        
        //直接插入排序
        for (int i = 1; i < a.length; i++) { //执行N-1轮
            //待插入元素
            int temp = a[i]; //从第二个元素开始，和其前面的元素对比
            int j; 
         
            for (j = i-1; j>=0; j--) {
                //从a[0]到a[j]已经是有序的了，下面的目的，就是找到a[i]的插入位置
                //将大于temp的元素往后移动一位
                if(a[j]>temp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp; //找到了插入的位置，将temp放入
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}