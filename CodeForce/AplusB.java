
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
public class AplusB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
    }
}
