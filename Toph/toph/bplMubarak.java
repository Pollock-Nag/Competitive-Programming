package toph;

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
public class bplMubarak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {

            String s = sc.next();
            function(s);
        }
    }

    public static void function(String str) {

        String s = str.toUpperCase().
                replace(" ", "").replaceAll("([A-C])", "")
                .replaceAll("([E-M])", "").replaceAll("([P-V])", "")
                .replaceAll("([X-Z])", "");

        //System.out.println(s);
        char a[] = new char[s.length()];
        a = s.toCharArray();

        //System.out.println(Arrays.toString(a));
        int countW_N_D = 0;
        int count_Run_Out = 0;
        int totalBall = s.length();

        for (int i = 0; i < a.length; i++) {
            if ((a[i] == 'N') || (a[i] == 'W') || (a[i] == 'D')) {
                countW_N_D++;
            }

        }
        //System.out.println("T B " + totalBall);
        //System.out.println("W N D " + countW_N_D);

        int result = totalBall - countW_N_D;

        //System.out.println("RESULT " + result);
        int OverCount = (result / 6);
        int ballCount = (result % 6);
//        System.out.println("OC " + OverCount);
//        System.out.println("BC " + ballCount);
        /*if (OverCount > 0) {
         System.out.println(OverCount + " OVER ");
         }
        
         if (ballCount > 0) {
         if (ballCount > 1) {
         System.out.println(ballCount + " BALLS");
         } else {
         System.out.println(ballCount + " BALL");
         }
         }*/
        if ((OverCount <= 0) && (ballCount <= 0)) {

        } else {

            if ((OverCount == 1) && (ballCount == 1)) {
                System.out.println(OverCount + " OVER " + ballCount + " BALL");
            }
            if ((OverCount >= 2) && (ballCount >= 2)) {
                System.out.println(OverCount + " OVERS " + ballCount + " BALLS");
            }

            if ((OverCount >= 2) && (ballCount == 0)) {
                System.out.println(OverCount + " OVERS");
            }

            if ((OverCount >= 2) && (ballCount == 1)) {
                System.out.println(OverCount + " OVERS " + ballCount + "BALL");
            }
            /*if ((OverCount >= 2) && (ballCount > 1)) {
             System.out.println(OverCount + " OVERS " + ballCount + "BALLS");
             }*/

            if ((OverCount == 1) && (ballCount >= 2)) {
                System.out.println("1" + " OVER " + ballCount + " BALLS");
            }
            if ((OverCount == 0) && (ballCount == 1)) {
                System.out.println("1" + " BALL");
            }

            if ((OverCount == 1) && (ballCount == 0)) {
                System.out.println("1" + " OVER");
            }
            if ((OverCount == 0) && (ballCount >= 2)) {
                System.out.println(ballCount + " BALLS");
            }

        }
        // System.out.println(" ");
    }

}
