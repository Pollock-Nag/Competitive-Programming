
import java.util.Arrays;
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
public class StringTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0=sc.next();
        String s = s0.toLowerCase();
        String s1 = s.replaceAll("a", "").replaceAll("e", "")
                .replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").replaceAll("y", "");

        char b[] = s1.toCharArray();

        /*     char a[] = new char[2 * s1.length()];

         int bC = 0;
         for (int i = 0; i < a.length; i++) {
         a[i] = '.';
         }
         for (int i = 1; i < a.length; i = i + 2) {
         a[i] = b[bC];
         bC++;
         }

         for(char c: a){
         System.out.print(c);
         }*/
        for (int i = 0; i < b.length; i++) {
            System.out.print("." + b[i]);
        }

    }
}
