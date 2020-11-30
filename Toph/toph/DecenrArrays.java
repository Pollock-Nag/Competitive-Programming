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
public class DecenrArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int tA[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            tA[j] = a[i];
            j++;
        }
        Arrays.sort(tA);
        int c = 0;

        if (Arrays.equals(tA, a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
