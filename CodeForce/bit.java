/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pollock
 */
import java.util.Scanner;

public class bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        
        int var = 0;
        for (int i = 0; i < a; i++) {
            String s = sc.next();

            // System.out.println(s);
            if (s.equals("++X")) {
                //System.out.println(++var);
                ++var;
            } else if (s.equals("X++")) {
                //System.out.println(var++);
                var++;
            } else if (s.equals("--X")) {
                //System.out.println(--var);
                --var;
            } else if (s.equals("X--")) {
                // System.out.println(var--);
                var--;
            }

        }
        System.out.println(var);

    }
}
