package com;

import java.util.*;

public class Cookies implements Task {

    static int jes(int k, List<Integer> A) {
        int val = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>(A);
        while (Q.peek() < k) {
            if (Q.size() > 2) {
                int f = Q.poll();
                int s = Q.poll();
                int nC = f + 2 * s;
                val++;
                Q.offer(nC);
            } else {
                return -1;
            }
        }
        return val;
    }

    @Override
    public void action() {
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 7, 3, 6, 4, 6));
        System.out.println(jes(9, a));
    }
}
