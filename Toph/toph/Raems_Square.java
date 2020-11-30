/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class Raems_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        long a[] = new long[t];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            a[i] *= a[i];
            System.out.println(a[i]);
        }
    }
}
