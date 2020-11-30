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
public class Pakna_and_Polygamy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double a[] = new double [t];
        for(int i=0;i<a.length;i++){
        a[i]= sc.nextInt();
        double sqr = (a[i]*a[i]);
        a[i]= ((3*Math.sqrt(3)/2)*sqr);
        }
        
        for(int i=0;i<a.length;i++){
        System.out.println(Math.floor(a[i]*100000)/100000);
    }
        
    }
    
}
