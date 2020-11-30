/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class ForLoopFTW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        int k = 0;
        for (int i = 1; i <= s; i++) {
            if (s % i == 0) {
                a[k] = i;
                k++;
                //System.out.print(i + " , ");
            }
        }
        int[] b = new int[s];
        int[] c = new int[s];
        int l = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] * a[j] == s) {
                    b[l] = a[i];
                    c[l] = a[j];
                    l++;
                }
            }
        }
        Arrays.sort(b);
        Arrays.sort(c);

        //Arrays.toString(c);
        //print2Smallest(b);
        System.out.println(print2Smallest(b) + max(c));
       // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(c));

       // Arrays.toString(a);
        //int sum=0;
        // Arrays.sort(c, Collections.reverseOrder());
        // Arrays.sort(c, Collections.reverseOrder(new nComparator()));
        /*for (int i = 1; i < b.length; i++) {
         System.out.print(b[i] + " ");

         }
        
        
         System.out.println("");
        
         for (int i = 1; i < c.length; i++) {
         System.out.print(c[i] + " ");

         }*/
        /*for (int i = c.length - 1; i >= 1; i--) {
         System.out.print(c[i] + " ");

         }*/
        //System.out.println(q + r);
    }

    static int print2Smallest(int arr[]) {
        int first, second, arr_size = arr.length;
        int s = 0;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            /*System.out.println(" Invalid Input ");
             return;*/
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            /* If current element is smaller than first 
             then update both first and second */
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } /* If arr[i] is in between first and second 
             then update second  */ else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            /* System.out.println("There is no second"
             + "smallest element");*/
        } else {
            /* System.out.println("The smallest element is "
             + first + " and second Smallest"
             + " element is " + second);*/
            s = second;
        }

        return s;
    }

    public static int max(int[] t) {
        int maximum = t[0];   // start with the first value
        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];   // new maximum
            }
        }
        return maximum;
    }

}
