
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
public class Array_with_odd_disit_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int odd = 0;
            int even = 0;

            int a[] = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();

                if (a[i] % 2 != 0 || a[i] == 1) {
                    odd++;

                } else {
                    even++;
                }
                sum = sum + a[i];
            }

            if (sum % 2 != 0 || sum == 1) {
                System.out.println("YES");
            } else {

                if (odd != 0 && even != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }
}
