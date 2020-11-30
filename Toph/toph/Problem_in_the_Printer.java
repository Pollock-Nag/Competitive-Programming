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
public class Problem_in_the_Printer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            if (s1.equals("the end.")) {
                break;
            }
            s = (s + "\n" + s1).toLowerCase();

        }
        // System.out.println("Output: "+s);

        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'b') {
                c[i] = '6';
            } else if (c[i] == '6') {
                c[i] = 'b';
            }

            if (c[i] == 'g') {
                c[i] = '9';
            } else if (c[i] == '9') {
                c[i] = 'g';
            }
            if (c[i] == 'l') {
                c[i] = '1';
            } else if (c[i] == '1') {
                c[i] = 'l';
            }
            if (c[i] == 'o') {
                c[i] = '0';
            } else if (c[i] == '0') {
                c[i] = 'o';
            }
            if (c[i] == 's') {
                c[i] = '5';
            } else if (c[i] == '5') {
                c[i] = 's';
            }
            if (c[i] == 'z') {
                c[i] = '2';
            } else if (c[i] == '2') {
                c[i] = 'z';
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
