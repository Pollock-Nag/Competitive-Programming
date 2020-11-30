/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Toph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 1000;
        int a[] = new int[p];
        int nA[] = new int[p / 2];

        for (int i = 0; i < a.length; i++) {
            if (primeChecker(i) != 0) {
                a[i] = primeChecker(i);
                //System.out.print(primeChecker(i) + " ");
            }
        }

        int k = 1;
        for (int j = 1; j < a.length; j++) {
            // for (int i = 1; i < nA.length; i++) {
            if (a[j] != 0) {
                nA[k] = a[j];
                //    }
                k++;
            }
        }
        int n = sc.nextInt();
        /*for (int i = 0; i < nA.length; i++) {
            System.out.println("[" + i + "] " + nA[i] + " ");
        }*/
         System.out.println( nA[n]);
    }

    public static int primeChecker(int n) {
        boolean isPrime = true;
        int c = 0;
        int counter = 0;
        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;

                }

            }
        }
        if (isPrime == true) {
            //System.out.println("Prime");
            counter = 100;
        } /*else {
         System.out.println("Not Prime");
         }*/

        if (counter > 0) {
            // System.out.print(n + " , ");
            counter = n;
        }

        return counter;
    }
}
