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
public class That_1_Minute_See_You_Tomorrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] >= m) {
                sum = sum + m;
                count++;
            }
        }
        if (count == n && sum == 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
