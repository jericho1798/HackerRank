package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Finds median
 */
public class MockOne implements Task{
    @Override
    public void action() {
        List<Integer> arr = Arrays.asList(0,1,2,4,6,5,3);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get((arr.size())/2));
    }
}
