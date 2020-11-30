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
public class BetterPasswords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = s.replace("s", "$");
        String q = p.replaceAll("i", "!");
        String str = q.replaceAll("o", "()");
        String res = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(res + ".");
    }
}
