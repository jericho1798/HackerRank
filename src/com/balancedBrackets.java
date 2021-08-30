package com;

import java.util.*;

public class balancedBrackets implements Task {
    String str = "{[(])}";

    @Override
    public void action() {
        System.out.println(isBalanced(str));
    }

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.peek()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
