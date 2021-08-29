package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class gridChallenge implements Task {
    List<String> grid = Arrays.asList("eibjbwsp", "ptfxehaq", "jxipvfga", "rkefiyub", "kalwfhfj", "lktajiaq", "srdgoros", "nflvjznh");

    @Override
    public void action() {
       System.out.println(grid(grid));
    }

    public static String grid(List<String> grid) {
        System.out.println(grid.size() + " " + grid.get(0).length());
        for (int i = 0; i < grid.size(); i++) {
            char[] c = grid.get(i).toCharArray();
            Arrays.sort(c);
            grid.set(i, String.valueOf(c));
        }
        System.out.println(grid);
        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 1; j < grid.size(); j++) {
                if (grid.get(j).charAt(i) < grid.get(j - 1).charAt(i)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
