package com;

import java.util.Arrays;

public class legoBlocks implements Task{
    private static final long mod = 1000000007;
    private static long[] f = new long[1111];
    private static long[] g = new long[1111];
    private static long[] h = new long[1111];

    static long pow(long a, int p) {
        long ans = 1;
        while (p != 0) {
            if (p % 2 != 0) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            p /= 2;
        }
        return ans;
    }

    static void mn(int n, int m) {
        f[0] = 1;
        Arrays.fill(f, 0);
        Arrays.fill(g, 0);
        for(int i = 1; i < 1001; i++) {
            for(int j = 1; j <= 4; j++) {
                if(i - j >= 0) f[i] = (f[i] + f[i - j]) % mod;
            }
        }
        for(int i = 1; i <= m; i++) g[i] = pow(f[i], n);
        Arrays.fill(h, 0);
        h[1] = 1;
        for(int i = 2; i <= m; i++) {
            h[i] = g[i];
            long tmp = 0;
            for(int j = 1; j < i; j++) tmp = (tmp + h[j] * g[i - j]) % mod;
            h[i] = (h[i] - tmp + mod) % mod;
        }
        System.out.println((int) h[m]);
    }



    @Override
    public void action() {
        mn(2, 3);
    }
}
