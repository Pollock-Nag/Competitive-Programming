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
public class the_depressed_guy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        System.out.println(maxD(a, n) + 1);

    }

    public static int maxD(long a[], int n) {

        HashMap<Long, Integer> m = new HashMap<>();
        int max_d=0;
      
        for(int i=0;i<n;i++){
          
            if(!m.containsKey(a[i])){
            m.put(a[i], i);
                System.out.println(m);
            
            }
            else{
            max_d=Math.max(max_d, i-m.get(a[i]));
            }
        }
        return max_d;
    }
}
/* int first = 0;
 int sec = 0;
 int l = 0;
 int r = n - 1;
 int i = 0, j = 0;

 while (l != r && l < a.length && r >= 0) {
 if(a[l]==a[r]){
 sec=n-1;
 break;
 }
            
 if (a[l] != a[r]) {
 r--;
 if(a[l]==a[r]){
 sec=r;
 break;
 }else{
 l++;
 }
 l++;
 }
 l++;

 }
 System.out.println(sec + 1);
 */
