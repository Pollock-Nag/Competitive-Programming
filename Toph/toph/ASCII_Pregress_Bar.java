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
public class ASCII_Pregress_Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
       // int ff=(int)f;
        int newNum = (int) f;
        if (newNum >= 0 && newNum <= 10) {
            newNum = 0;
            System.out.println("[..........] " + (int) f + "%");
        } else if (newNum >= 10 && newNum <= 19) {
            newNum = 10;
            System.out.println("[+.........] " + (int) f + "%");
        } else if (newNum >= 20 && newNum <= 29) {
            newNum = 20;
            System.out.println("[++........] " + (int) f + "%");
        } else if (newNum >= 30 && newNum <= 39) {
            newNum = 30;
            System.out.println("[+++.......] " + (int) f + "%");
        } else if (newNum >= 40 & newNum <= 49) {
            newNum = 40;
            System.out.println("[++++......] " + (int) f + "%");
        } else if (newNum >= 50 && newNum <= 59) {
            newNum = 50;
            System.out.println("[+++++.....] " + (int) f + "%");
        } else if (newNum >= 60 && newNum <= 69) {
            newNum = 60;
            System.out.println("[++++++....] " + (int) f + "%");
        } else if (newNum >= 70 && newNum <= 79) {
            newNum = 70;
            System.out.println("[+++++++...] " +  (int)f + "%");
        } else if (newNum >= 80 && newNum <= 89) {
            newNum = 80;

            System.out.println("[++++++++..] " + (int)f + "%");
        } else if (newNum >= 90 & newNum <= 99) {
            newNum = 90;
            System.out.println("[+++++++++.] " + (int) f + "%");
        } else if (newNum == 100) {
            newNum = 100;

            System.out.println("[++++++++++] " + (int) f + "%");
        }
     //   System.out.println("new Num =" + newNum);
    }
}
