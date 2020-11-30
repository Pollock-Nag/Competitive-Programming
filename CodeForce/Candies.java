/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pollock
 */
import java.util.*;

public class Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        int ans[] = new int[t];
        int tI = 0;

        for (int i = 0; i < a.length; i++) {
            int n = sc.nextInt();
            if (n >= 3) {
                a[i] = n;
            }
            if (a[i] != 0) {
                a[tI++] = a[i];
            }

            int k = ((int) Math.pow(2, i));
            
            if(k>1){
            System.out.println("{a[i]} = "+a[i]);
            System.out.println("{k}= "+k);
            int anss = a[i] / k;
            System.out.println("{Ans:}= "+anss);
            System.out.println("********************");
            }
            
            
            
            
        }

        int na[] = new int[tI];
        System.arraycopy(a, 0, na, 0, tI);
        System.out.println(tI);
        System.out.println(Arrays.toString(na));
        System.out.println("Ans: " + Arrays.toString(ans));

    }
}
