/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class Geometry_Forever {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
     
        for (int i = 1; i <= 1000; i++) {
            if (a + b > i && a + i > b && b + i > a) {
                c++;
            }
        }
        System.out.println(c);
    }
}
