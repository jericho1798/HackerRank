package com;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1) Finds median
 * 2) Matrix
 */
public class MockOne implements Task {
    @Override
    public void action() {

       /* List<Integer> arr = Arrays.asList(0,0,2,4,6,5,3);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get((arr.size())/2));*/
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a = Arrays.asList(112, 42, 83, 119);
        List<Integer> b = Arrays.asList(56, 125, 56, 49);
        List<Integer> c = Arrays.asList(15, 78, 101, 43);
        List<Integer> d = Arrays.asList(62, 98, 114, 108);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        int out = 0;
        boolean flag = false;
        int ls;
        int rs;
        System.out.println();

        int sum = 0;
        for (int i = 0; i < arr.size() / 2; i++) {
            List<Integer> test = new ArrayList<>();
            for (int j = 0; j < arr.size() / 2; j++) {
                int[] mas = new int[] {arr.get(i).get(j), arr.get(arr.size() - i - 1).get(j), arr.get(i).get(arr.size() - j - 1), arr.get(arr.size() - i - 1).get(arr.size() - j - 1)};

                test.clear();
                for(int k = 0; k < mas.length; k++) {
                    System.out.println(k + ": " + mas[k]);
                    test.add(mas[k]);
                }
                System.out.println(test);

                Collections.sort(test);
                sum += test.get(test.size() - 1);
                System.out.println(test + " " + test.get(test.size() - 1) + " " + sum);
                System.out.println(test.size());
            }
        }
        System.out.println(sum);

    }

}
