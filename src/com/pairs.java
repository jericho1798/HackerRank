package com;

import java.util.List;
import java.util.Stack;

public class pairs {

    static int pairsFind(int k, List<Integer> arr) {
        int out = 0;
        for (Integer a : arr) {
            for (Integer j : arr) {
                if ((a - k) == j) {
                    out++;
                }
            }
        }
        return out;
    }
}
