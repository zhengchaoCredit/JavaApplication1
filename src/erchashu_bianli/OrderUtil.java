package erchashu_bianli;

/**
 *
 * @author zhengchao
 */
public class OrderUtil {
    
    public static void preOrder(Node node){
        if(node != null){
            System.out.print(node.value);//先中间，直接输出
            preOrder(node.left);           //再左边
            preOrder(node.right);          //最后左边
        }
    }
    
    public static void middleOrder(Node node){
        if(node != null){
            middleOrder(node.left);         //先左边
            System.out.print(node.value); //再中间直接输出
            middleOrder(node.right);        //最后右边
        }
    }
    
    public static void lastOrder(Node node){
        if(node != null){
            lastOrder(node.left);         //先左边
            lastOrder(node.right);        //再右边
            System.out.print(node.value); //最后输出中间
        }
    }
    
}
