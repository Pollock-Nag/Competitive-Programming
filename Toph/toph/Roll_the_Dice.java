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
public class Roll_the_Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            System.out.println((6*n)+" "+n);
        }
    }
}
