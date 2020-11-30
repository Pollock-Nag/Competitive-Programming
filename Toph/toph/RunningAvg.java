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
public class RunningAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        //double dc= 14.1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum = sum + x;
            c++;
            //running avg
            double ans = sum / c;
            if ((ans - (int) ans != 0)) {
                System.out.printf("%.10f ", ans);
            } else {
                System.out.println((int) +ans);
            }
            // System.out.printf("%.10f",ans);
        }

    }
}
