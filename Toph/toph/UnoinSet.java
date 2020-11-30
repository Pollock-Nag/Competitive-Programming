/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
import java.util.HashSet;

public class UnoinSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Integer setA[] = new Integer[n];
        for (int i = 0; i < setA.length; i++) {
            setA[i] = sc.nextInt();
        }

        Integer setB[] = new Integer[m];
        for (int i = 0; i < setB.length; i++) {
            setB[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(setA));
        set.addAll(Arrays.asList(setB));
       // System.out.println(set);

        Integer unionSet[] = {};
        
       unionSet= set.toArray(unionSet);
        /*for(int i:unionSet){
            System.out.print(i+" ");
        }*/
       //******ARRAY IS NEED TO BE SORTED******//
       Arrays.sort(unionSet);
       for(int i=0;i<unionSet.length-1;i++){
           System.out.print(unionSet[i]+" ");
       }
       System.out.print(unionSet[unionSet.length-1]);
       
       
        
       
    }
}
