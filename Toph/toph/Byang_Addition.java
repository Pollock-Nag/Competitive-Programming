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
public class Byang_Addition {

    static int carry = 0;
    static int carryCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (count(a, b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int count(int a, int b) {

        if (a / 10 == 0 || b / 10 == 0) {
            int sum = a % 10 + b % 10 + carry;
            if (sum >= 10) {
                carry = 1;
                carryCount++;
                return (count(a / 10, b / 10));
            } else {
                return carryCount;
            }
        } else {
            int sum = a % 10 + b % 10 + carry;
            if (sum >= 10) {
                carry = 1;
                carryCount++;

            } else {
                carry = 0;
            }
            return (count(a / 10, b / 10));
        }

    }
}
