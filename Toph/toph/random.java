/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Random;

/**
 *
 * @author Pollock
 */
public class random {
    public static void main(String[] args) {
        Random rd = new Random();
        String s="";
        for(int i=0;i<6;i++){
        int kMap= rd.nextInt(15);
        s=s+kMap+",";
        }
        System.out.println(s);
        int a[] ={10,2,3,50,4};
        System.out.println(a.length);
    }
    
}
