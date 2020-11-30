/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class toph2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);

        String p = b.replaceAll("0", "");
        int k = Integer.parseInt(p, 2);

        System.out.println(k);
        
    }

}
