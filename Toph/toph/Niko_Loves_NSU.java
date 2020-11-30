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
import java.math.*;

public class Niko_Loves_NSU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        //char toCheck=s.charAt(n);
        int co = 0;
        String cc = "NSU";
        if (s.matches(cc)) {
            co++;
        }
        System.out.println(co);
    }

}
