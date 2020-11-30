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
public class Alphabet_Animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.next();
        char check = p1.charAt(p1.length() - 1);
        int n = sc.nextInt();
        char c[] = new char[n];
        String a[] = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int[] countOfrFirstChar = new int[128];
        
        for (int i = 0; i < n; i++) {
            countOfrFirstChar[a[i].charAt(0)]++;
            //System.out.println("count of 1st char "+countOfrFirstChar[a[i].charAt(0)]);
        }
        
        for (int i = 0; i < n; i++) {
            char x = a[i].charAt(0);
            char y = a[i].charAt(a[i].length() - 1);
            //System.out.println("x: "+x);
            //System.out.println("Y: "+y);
            //System.out.println("ck "+countOfrFirstChar[y]);
            if(x==check && (countOfrFirstChar[y]==0 || (x==y && countOfrFirstChar[y]==1))){
                System.out.println(a[i]+"!");
               return;
            }
        }
          for (int i = 0; i < n; i++) {
            if (a[i].charAt(0) == check) {
                System.out.println(a[i]);
               return;
            }
        }
        System.out.println("?");
    }
}
    


/*int cSize = c.length - 1;
 String ans = "";

 for (int i = 0; i < a.length ; i++) {

 a[i] = sc.next();
            
 c[i] = a[i].charAt(0);

 if (c[i] == check) {

 if (i == cSize) {
 ans = ans + a[i] + "!";
                    
 }
 if (i != cSize) {
 ans = ans + a[i];
 }
 break;
 }
 }
 System.out.println(Arrays.toString(a));
 System.out.println(Arrays.toString(c));
 if (ans.isEmpty()) {
 System.out.println("?");
 } else {
 System.out.println(ans);
 }
 }
 }*/
