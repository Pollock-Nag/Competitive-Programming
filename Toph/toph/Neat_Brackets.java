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
public class Neat_Brackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < a.length; i++) {
         
            if (a[i] == '(') {
                st.push(a[i]);
            }
            if ((a[i] == ')')) {
                
                if(st.isEmpty()){
                   // System.out.println("No");
                    st.push('N');
                    break;
                }
                else{
                    st.pop();
                }
                
            }
        }
        
        if(st.isEmpty()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
