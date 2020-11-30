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
//********************************************//
//CAANOT SOLVE WITH JAVA//
//************************************************//
public class make_It_Big {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String res = s;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {

                    for (int k = 0; k < s.length(); k++) {
                        for (int l = k + 1; l < s.length(); l++) {
                            String res2 = s;
                            swap(res2, res2.charAt(i), res2.charAt(j));
                            swap(res2, res2.charAt(k), res2.charAt(l));
                            res = Integer.toString(Math.max(Integer.parseInt(res2), Integer.parseInt(res)));
                        }
                    }

                }
            }
            System.out.println(res);
        }
    }

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
