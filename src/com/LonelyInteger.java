package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LonelyInteger implements Task{
    List<Integer> ar = Arrays.asList(1, 2, 3, 4, 3, 2 , 1);
    @Override
    public void action() {
        for(Integer a : ar) {
            if(Collections.frequency(ar, a) == 1) {
                System.out.println(a);
            }
        }
    }
}
