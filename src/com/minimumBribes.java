package com;

import java.util.Arrays;
import java.util.List;

public class minimumBribes implements Task {
    List<Integer> q = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);

    @Override
    public void action() {
        mB(q);
    }

    public static void mB(List<Integer> q) {
        int out = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    out++;
                }
            }
        }
        System.out.println(out);
    }
}
