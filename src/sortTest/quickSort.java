package sortTest;

public class quickSort {
    
    public static void main(String[] args){
        
        int[] array = {6,41,152,1234,54,124,41,13,61,325,13};
        
        quickSort.quick_sort1(array,0,array.length-1);
        printArray(array);
        
    }
    
    //分治法
    public static void quick_sort1(int s[], int left, int right) {  
        if (left < right) {  
            int i = AdjustArray(s, left, right);//先成挖坑填数法调整s[]  
            quick_sort1(s, left, i - 1);  // 递归调用：排序上一轮排序后左边的元素   
            quick_sort1(s, i + 1, right); // 递归调用：排序上一轮排序后右边的元素 
        }  
    }
    
    //返回调整后基准数的位置 
    public static int AdjustArray(int s[], int l, int r)  {  
        int i = l, j = r;  
        int x = s[l]; //s[l]即s[i]就是第一个坑  
        
        while (i < j) {  
            // 从右向左找小于x的数来填s[i]  
            while(i < j && s[j] >= x)   
                j--;    
            if(i < j)   
            {  
                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑  
                i++;  
            }  

            // 从左向右找大于或等于x的数来填s[j]  
            while(i < j && s[i] < x)  
                i++;    
            if(i < j)   
            {  
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑  
                j--;  
            }  
        }  
        
        //退出时，i等于j。将x填到这个坑中。  
        s[i] = x;  
        return i;  
    }  
    
    //打印出数组
    public static void printArray(int[] array) {  
        System.out.print("{");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i]);  
            if (i < array.length - 1) {  
                System.out.print(", ");  
            }  
        }  
        System.out.println("}");  
    }
    
}


