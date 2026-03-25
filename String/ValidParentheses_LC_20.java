package String;

import java.util.Stack;

public class ValidParentheses_LC_20 {
    public static boolean isParentheses(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();

                if(s.charAt(i) == ')' && top == '(' ||
                s.charAt(i) == '}' && top == '{' ||
                s.charAt(i) == ']' && top == '['){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        //System.out.println(paisi);
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[";

        isParentheses(s);
    }
}
