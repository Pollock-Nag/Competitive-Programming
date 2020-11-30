
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // System.out.println(s.length());
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.length() > 10) {
                // System.out.println(s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1));
                System.out.print(s.charAt(0));
                System.out.print(s.length() - 2);
                System.out.println(s.charAt(s.length() - 1));

            } else {
                System.out.println(s);
            }
        }
    }
}
