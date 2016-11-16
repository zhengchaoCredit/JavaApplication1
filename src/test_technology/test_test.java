/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_technology;

import java.util.Stack;

/**
 *
 * @author zhengchao
 */
public class test_test {
    
    public static boolean chkLegal(String A) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < A.length(); i++){
            Character ch = A.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
                continue;
            }
            if(!stack.isEmpty()){
                Character c = stack.peek();
                if(ch == '}' && c == '{')
                    stack.pop();
                else if(ch == ']' && c == '[')
                    stack.pop();
                else if(ch == ')' && c == '(')
                    stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
    
    
    public static void main(String[] args) {
        String right = "(90+5)*a[i]]";
        String notRight = "(90+5))*a[i]";
        System.out.println(chkLegal(right));
        System.out.println(chkLegal(notRight));
        
    }
    
    
}
