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
public class MatchingBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '[' || a[i] == '{' || a[i] == '(') {
                st.push(a[i]);

            }
            if (a[i] == ']' || a[i] == '}' || a[i] == ')') {
                if (st.isEmpty()) {
                    counter--;
                } else if (!isMatchPair(st.pop(), a[i])) {
                    counter--;
                }

            }
        }

        if (st.isEmpty()) {

            if (counter >= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }

    }

    private static boolean isMatchPair(char c1, char c2) {

        if ((c1 == '(') && (c2 == ')')) {
            return true;
        }
        if ((c1 == '{') && (c2 == '}')) {
            return true;
        }
        if ((c1 == '[') && (c2 == ']')) {
            return true;
        } else {
            return false;
        }
    }
}
