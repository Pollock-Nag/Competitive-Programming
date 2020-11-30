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
public class Thought_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            avg(sc.nextInt(), sc.nextInt());
        }

    }

    public static void avg(int a, int b) {
        int avg = (a + b) / 2;
        if (avg % 2 == 0) {
            System.out.println("Sadia will be happy.");
        } else {
            System.out.println("Oops!");
        }

    }
}
