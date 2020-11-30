package toph;

import java.util.*;
public class Penguins_of_Madagascar {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();String s = sc.next();int n2 = sc.nextInt();
        while (n2-- > 0) {
            String s2 = sc.next();
            if (check(s, s2)) {System.out.println("Yes");
            }else{System.out.println("No");
            } 
        }}
        public static boolean check(String s, String s2) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s2.charAt(j)) {j++;}
            if (j == s2.length()) {return true;}
        }
        return false;
    }}
