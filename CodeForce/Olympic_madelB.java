
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
public class Olympic_madelB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r, p1, p2, t, a, b;
        t = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > t) {
                t = temp;
            }
        }
        r = t;
        t = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > t) {
                t = temp;
            }
        }
        p1 = t;
        t = (int) 2e9;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < t) {
                t = temp;
            }
        }
        p2 = t;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a);
        double ans = ((double) (b * p1 * r * r) / ((double) a * p2 + b * p1));
        System.out.printf("%.8f", Math.sqrt(ans));

    }
}
