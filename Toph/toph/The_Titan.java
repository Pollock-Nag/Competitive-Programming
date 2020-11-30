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
public class The_Titan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int sum=0;
       int n = sc.nextInt();
        for(int i=1;i<=n;i++){
        sum= sum+i*i;
        }
        System.out.println(sum);
    }
 
}
