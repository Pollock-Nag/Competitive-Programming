    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Character.digit;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class icpc2nd {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BigInteger bi = BigInteger.ONE;
        
//long n = sc.nextLong();
        long number = sc.nextLong();
        //   String number1 = Long.toString(num);
        int[] frequency = new int[10];
        while (number > 0) {

            long digit = (number % 10);
            // int digit = bigmod((int) number,1,10);
            number /= 10;

            frequency[(int) digit]++;

        }
        //System.out.println(Arrays.toString(frequency));
        /* for (int i = 0; i < 10; ++i) {
         System.out.println(frequency[i]);
         }*/
        int maxFrequency = 0;
        int index = 0;
        for (int i = 0; i < 10; ++i) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                index = i;
            }
        }
        System.out.println(index);

    }

    /* static int bigmod(int m, long n, int k) {

     if (n == 0) {
     return 1 % k;
     }
     int p = bigmod(m, n / 2, k);
     p = (p * p) % k;
     if (n % 2 == 1) {
     p = (p * m) % k;
     }
     return p;
     }*/
}
