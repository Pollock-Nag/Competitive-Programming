/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Nfactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int k = 0; k < tc; k++) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("0001");
            }
            if (n == 1) {
                System.out.println("0001");
            }
            if (n == 2) {
                System.out.println("0002");
            }
            if (n == 3) {
                System.out.println("0006");
            }
            if (n == 4) {
                System.out.println("0024");
            }
            if (n == 5) {
                System.out.println("0120");
            }
            if (n == 6) {
                System.out.println("0720");
            }
            if (n >= 7) {
                BigInteger f = new BigInteger("1");

                for (int i = 2; i <= n; i++) {
                    f = f.multiply(BigInteger.valueOf(i));
                }
                String ans = f.toString();
                char[] c = ans.toCharArray();

                System.out.print(c[c.length - 4]);
                System.out.print(c[c.length - 3]);
                System.out.print(c[c.length - 2]);
                System.out.print(c[c.length - 1]);
            }
        }
    }
}
