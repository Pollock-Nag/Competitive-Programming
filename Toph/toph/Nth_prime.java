/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Nth_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[500000];
        boolean[] isPrime = new boolean[500000];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j < isPrime.length; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        a[1] = 2;
        int c = 1;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                a[c] = i;
                c++;
            }
        }
        System.out.println(Arrays.toString(a));
        // System.out.println(a[6]);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
