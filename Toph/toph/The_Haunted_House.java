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
public class The_Haunted_House {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        for (int ii = 0; ii < t; ii++) {
            String s = sc.next();    
            for (int i = s.length() / 2 - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            
            }
            System.out.println("");
        }
    }

    /*public static void func() {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     for (int i = s.length() / 2 - 1; i >= 0; i--) {
     System.out.println(s.charAt(i));

     }
     }*/
}
