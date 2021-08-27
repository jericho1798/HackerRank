package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort1 implements Task{
    @Override
    public void action() {
        List<Integer> input = Arrays.asList(1, 1, 3, 2, 1);
        int[] output = new int[100];
        List<Integer> out = new ArrayList<>(output.length);
        for(Integer num : input) {
            output[num]++;
        }
        for(int i : output) {
            out.add(i);
        }
        System.out.println(Arrays.toString(output));
    }
}
