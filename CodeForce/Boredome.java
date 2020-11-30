/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pollock
 */
import java.io.*;
import java.util.*;

public class Boredome {

    static long count[];
    static long dp[];
    static int max = 100007;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        count = new long[max];
        dp = new long[max];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            count[sc.nextInt()]++;
        }
        dp[0] = 0;
        dp[1] = count[1];
        for (int i = 2; i < max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + count[i] * i);
        }
        System.out.println(dp[max - 1]);

    }
}
