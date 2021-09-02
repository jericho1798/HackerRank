package com;

import java.util.Scanner;
import java.util.Stack;

public class simpleTextEditor implements Task {
    private static final Scanner scanner = new Scanner(System.in);
    private static StringBuilder S = new StringBuilder("");
    private static StringBuilder out = new StringBuilder("");
    private static Stack<String> stack = new Stack<>();

    static void append(String W) {
        S.append(W);
    }

    static void delete(int k) {
        S.delete(S.length() - k, S.length());
    }

    static void print(int k) {
        out.append(S.charAt(k - 1));
        out.append("\n");
    }

    static void undo() {
        S = new StringBuilder(stack.pop());
    }

    @Override
    public void action() {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int testsItr = 0; testsItr < tests; testsItr++) {
            String a = scanner.nextLine();
            String[] c = a.split(" ");
            func(c);
        }
        scanner.close();
        System.out.println(out);
    }

    static void func(String[] c) {
        switch (c[0]) {
            case "1":
                stack.push(S.toString());
                append(c[1]);
                break;
            case "2":
                stack.push(S.toString());
                delete(Integer.parseInt(c[1]));
                break;
            case "3":
                print(Integer.parseInt(c[1]));
                break;
            case "4":
                undo();
                break;
            default:
                break;
        }
    }

}
