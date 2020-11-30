
import java.util.Arrays;
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
public class Olympic_Medal {

    static double arr[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //  System.out.println(Arrays.toString(arr));
        double r1 = arr[n - 1];

        // System.out.println("r1 " + r1);
        int m = sc.nextInt();
        arr = new double[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double p1 = arr[m - 1];

        //System.out.println("p1: " + p1);
        int k = sc.nextInt();
        arr = new double[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        double p2 = arr[0];
        //double p2=1;

        // System.out.println("p2: " + p2);
        int a = sc.nextInt();
        //  System.out.println("a: " + a);
        int b = sc.nextInt();
        // System.out.println("b: " + b);
        double ans = ((double) (b * p1 * r1 * r1) / ((double) a * p2 + b * p1));
        System.out.printf("%.8f", Math.sqrt(ans));

    }
}
