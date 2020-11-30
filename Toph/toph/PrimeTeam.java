/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Pollock
 */
public class PrimeTeam {

    static Vector primeV = new Vector<>();
    static Vector nonPrimeVector = new Vector<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                primeV.add(a[i]);
            } else {
                nonPrimeVector.add(a[i]);
            }

        }
        //System.out.println(primeV);
        //System.out.println(nonPrimeVector);
        // System.out.println((primeV.size() + nonPrimeVector.size()) / 2);

        if (primeV.size() == 0) {
            System.out.println("0");
        } else if (nonPrimeVector.size() == 0) {
            System.out.println(primeV.size() / 2);
        } else if (primeV.size() < nonPrimeVector.size()) {
            System.out.println(primeV.size());
        } else {
            System.out.println(nonPrimeVector.size());
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
