package com;

import java.util.List;
import java.util.Stack;

public class pairs {

    static int pairsFind(int k, List<Integer> arr) {
        int out = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer a : arr) {
            stack.addAll(arr);
            while (!stack.isEmpty()) {
                if ((a - k) == stack.pop()) {
                    out++;
                }
            }
        }
        return out;
    }
}
