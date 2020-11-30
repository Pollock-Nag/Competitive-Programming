/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Hot_Hike {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ans[] = {0, 99};
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i+2 < n; i++) {
         //   System.out.println(i+2);
            int u = Math.max(a[i], a[i+2]);
            if(u<ans[1]){
            ans[0]=i+1;
            ans[1]= u;
                    
            }
        }
        System.out.println(ans[0]+" "+ans[1]);
    }

}
