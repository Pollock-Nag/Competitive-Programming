/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Boys_in_the_Assembly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[] = new int[n];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        for (int i = 0; i < r; i++) {

            int ii = q.peek();
            q.remove();
            q.add(ii);

        }

      /*  String s = q.toString();
        System.out.println(s.charAt(1) + " " + s.charAt(s.length() - 2));*/

        Object aN[] = q.toArray();
        System.out.println(aN[0] + " " + aN[aN.length - 1]);

    }

}
