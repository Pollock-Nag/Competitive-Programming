/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.*;

/**
 *
 * @author Pollock
 */
public class Be_Like_Hasib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long low = 1;
        long high = sc.nextLong();
        long k = sc.nextLong();
        binarySearch(low, high, k);

    }

    public static void binarySearch(long low, long high, long key) {
        int c = 0;

        while (low < high) {
            long mid = (low + high) / 2;
            c++;
            if (mid < key) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        System.out.println(c);
        //return -1;
    }
}
