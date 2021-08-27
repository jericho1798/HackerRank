package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference implements Task {
    List<List<Integer>> arr = new ArrayList<>();
    List<Integer> a = Arrays.asList(1, 2, 3, 5);
    List<Integer> b = Arrays.asList(4, 5, 6, 5);
    List<Integer> c = Arrays.asList(7, 8, 9, 5);
    List<Integer> d = Arrays.asList(3, 2, 1, 4);

    @Override
    public void action() {
        int primary = 0;
        int secondary = 0;
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        System.out.println(arr);
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(arr.size() - 1 - i);
        }
        System.out.println(primary + " " + secondary);
        System.out.println(Math.abs(primary - secondary));
    }
}
