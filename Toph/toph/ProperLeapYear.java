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
public class ProperLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%400==0 || a%4==0&& a%100!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}