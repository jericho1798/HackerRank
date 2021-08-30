package com;

import java.util.Scanner;
import java.util.Stack;

public class d5T2 implements Task{
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void action() {
        Queue queue = new d5T2.Queue();
        queue.stack1 = new Stack<>();
        queue.stack2 = new Stack<>();
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            String a = scanner.nextLine();
            int b = 0;
            if(a.length() > 1) {
                String[] c = a.split(" ");
                b = Integer.parseInt(c[1]);
            }

            func(queue, Integer.parseInt(String.valueOf(a.charAt(0))), b);
        }
        scanner.close();
    }

    static class Queue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    static void push(Stack<Integer> top, int data) {
        top.push(data);
    }

    static int pop(Stack<Integer> top) {
        if (top.isEmpty()) {
            System.exit(0);
        }
        return top.pop();
    }

    static void enQueue(Queue queue, int x) {
        push(queue.stack1, x);
    }

    static int deQueue(Queue queue) {
        int x;
        getFront(queue);
        x = pop(queue.stack2);
        return x;
    }

    static void getFront(Queue queue) {
        int data;
        if (queue.stack1.isEmpty() && queue.stack2.isEmpty()) {
            System.exit(0);
        }
        if (queue.stack2.isEmpty()) {
            while (!queue.stack1.isEmpty()) {
                data = pop(queue.stack1);
                push(queue.stack2, data);
            }
        }
    }

    static void func(Queue q, int type, int val) {
        switch (type) {
            case 1:
                enQueue(q, val);
                break;
            case 2:
                deQueue(q);
                break;
            case 3:
                getFront(q);
                System.out.println(q.stack2.get(q.stack2.size() - 1));
                break;
        }
    }

}
