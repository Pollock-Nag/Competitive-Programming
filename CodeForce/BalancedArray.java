
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class BalancedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            balanceArray(n);
        }
    }

    public static void balanceArray(int n) {
        if ((n / 2) % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int val[] = {2, 4, 1, 5};
            int[] a = new int[n];
            int j = n / 2;
            for (int i = 0; i < n / 2; i++) {
                a[i++] = val[0];
                a[i] = val[1];
                a[j++] = val[2];
                a[j] = val[3];

                for (int k = 0; k < 4; k++) {
                    val[k] += 6;
                }
                j++;
            }
            for (int i : a) {
                System.out.print(i + " ");
            }System.out.println("");

        }

    }
}

