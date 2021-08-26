package com;

import java.util.Arrays;
import java.util.List;

/**
 * Prints two space-separated integers om one line:
 * the minimum sum and the maximum sum of 4 of 5 elements
 */
public class MiniMaxSum implements Task{
    @Override
    public void action() {
        List<Integer> arr = Arrays.asList(942381765, 627450398, 954173620, 583762094, 236817490);
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    sum += arr.get(j);
                }
            }
            if(sum > max) {
                max = sum;
            }
            if(sum < min) {
                min = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}
