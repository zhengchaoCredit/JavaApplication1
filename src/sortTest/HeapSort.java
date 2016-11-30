package sortTest;

/**
 *
 * @author zhengchao
 */
public class HeapSort {  
    
    public static void main(String[] args) {
        
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3,1 ,0,-12};  

        System.out.println("Before heap sort:");  
        ArrayUtils.printArray(array);  

        heapSort(array);  

        System.out.println("After heap sort:");  
        ArrayUtils.printArray(array);  
    }  

    public static void heapSort(int[] array) {  
        if (array == null || array.length <= 1) {  
            return;  
        }  

        //建立大根堆
        buildMaxHeap(array);  

        for (int i = array.length - 1; i >= 1; i--) {  
            //每次将顶部的元素与length - 1，length - 2.....的位置的元素交换，这样末尾的元素都是有序的了
            ArrayUtils.exchangeElements(array, 0, i);  

            //顶部元素交换后，破坏了堆的结构，重新调整
            maxHeap(array, i, 0);  
        }  
    }  

    //建立大根堆
    private static void buildMaxHeap(int[] array) {  
        if (array == null || array.length <= 1) {  
            return;  
        }  
        //这个地方有人可能有疑问：为什么从array.length / 2开始，你需要深刻理解二叉树的结构，并且此算法是：取每个父节点和其对应的两个子节点比，
        int half = array.length / 2;  
        for (int i = half; i >= 0; i--) { 
            
            maxHeap(array, array.length, i);  
        }  
    }  

    //当前节点和其两个子节点A,B比较，若A,B中较大数比如是array[A]大于当前节点的数，交换当前节点与array[A]。
    private static void maxHeap(int[] array, int heapSize, int index) {  
        int left = index * 2 + 1;  
        int right = index * 2 + 2;  
 
        int largest = index;  
        if (left < heapSize && array[left] > array[index]) {  
            largest = left;  
        }  

        if (right < heapSize && array[right] > array[largest]) {  
            largest = right;  
        }  

        if (index != largest) {  
            ArrayUtils.exchangeElements(array, index, largest);  

            maxHeap(array, heapSize, largest);  
        }  
    }  
}  