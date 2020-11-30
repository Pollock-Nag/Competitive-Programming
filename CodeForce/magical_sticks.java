
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
public class magical_sticks {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t= sc.nextInt();
       while(t-->0){
       int n = sc.nextInt();
           if(n%2!=0){
               System.out.println(n/2+1);
           }else{
               System.out.println(n/2);
           }
       }
    }
}
