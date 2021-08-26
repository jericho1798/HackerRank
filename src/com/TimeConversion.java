package com;

import java.util.Arrays;

public class TimeConversion implements Task{
    @Override
    public void action() {
        String s = "07:05:45AM";
        String[] arr = s.split(":");
        String out = "";
        if(arr[2].charAt(2) == 'A') {
            if(arr[0].equals("12")) {
                out = ("00:" + arr[1] + ":" + arr[2].substring(0, 2));
            } else {
                out =(arr[0] + ":" + arr[1] + ":" + arr[2].substring(0, 2));
            }
        } else if (arr[2].charAt(2) == 'P') {
            if(arr[0].equals("12")) {
                out =("12:" + arr[1] + ":" + arr[2].substring(0, 2));
            } else {
                out =((Integer.parseInt(arr[0]) + 12) + ":" + arr[1] + ":" + arr[2].substring(0, 2));
            }
        }
        System.out.println(out);
    }
}
