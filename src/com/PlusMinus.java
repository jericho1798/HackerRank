package com;

import java.util.Arrays;
import java.util.List;

/**
 * Prints the ratio of positive, negative and zero values int the array
 */
public class PlusMinus implements Task {

    @Override
    public void action() {
        List<Integer> arr = Arrays.asList(1, 2, 0, -1, -1);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.format("%.6f\n", ((float) positive / arr.size()));
        System.out.format("%.6f\n", ((float) negative / arr.size()));
        System.out.format("%.6f\n", ((float) zero / arr.size()));
    }
}
