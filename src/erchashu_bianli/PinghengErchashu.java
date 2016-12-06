package erchashu_bianli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhengchao
 */
public class PinghengErchashu {
    
    private final int[] array = { 1,2};  
    private static List<Node> nodeList = null;  
    
    //我们构建一个左拐二叉树的数据结构，假设节点数大于2，否则肯定是平衡二叉树。
    public  void createErChaTree() {  
        nodeList = new ArrayList<>();  
        // 将一个数组的值依次转换为Node节点  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new Node(array[nodeIndex]));  
        }  
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树  
        for (int parentIndex = 0; parentIndex < array.length - 2; parentIndex++) {  
            // 左孩子  
            nodeList.get(parentIndex).left = nodeList.get(parentIndex + 1);  
        }  
        nodeList.get(array.length - 2).left = nodeList.get(array.length - 1);  
    }  
    
    public static void main(String[] args){
        
        PinghengErchashu pingheng = new PinghengErchashu();  
        pingheng.createErChaTree();  
        
        Node root = nodeList.get(0);
        
        boolean isBalance = isBalance(root);
        System.out.println("是否是平衡二叉树："+isBalance);
    }
    
    
    public static boolean isBalance(Node head){
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head,1,res);
        return res[0];
    }
    
    public static int getHeight(Node head ,int level, boolean[] res){
        if(head == null){
            return level;
        }
        
        int lH = getHeight(head.left,level+1,res);
        if(!res[0]){
            return level;
        }
        
        int rH = getHeight(head.right,level+1,res);
        if(!res[0]){
            return level;
        }
        if(Math.abs(lH-rH)>1){
            res[0] = false;
        }
        return Math.max(lH, rH);
    }
    
}

