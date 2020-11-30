/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pollock
 */
import java.util.*;

public class search_easy_prblm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {

            if (a[i] == 1) {
                flag++;
            }
        }
        System.out.println(flag);
        if (flag > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
