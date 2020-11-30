
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
public class Sharmeen_and_distribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        //System.out.println(sum);
        Arrays.sort(a);
        if (sum % 2 != 0) {

            for (int i = 0; i < a.length; i++) {
                if ((a[i] % 2) != 0) {
                    //System.out.println(a[i]);
                    sum=sum-a[i];
                    break;
                }
            }
            System.out.println(sum/2);
           // System.out.println("Kisu korte hobe");

        } else {
            System.out.println(sum / 2);
        }
        
    }
}
