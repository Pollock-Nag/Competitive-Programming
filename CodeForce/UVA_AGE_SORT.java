
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class UVA_AGE_SORT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("5");
        int n = sc.nextInt();
      
        while(n!=0){
        long a[] = new long[n];
        // while (n > 0) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
       
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
        n=sc.nextInt();
       // sc.nextLine();
        }
        //   System.out.println("");
        //}
    }

}
