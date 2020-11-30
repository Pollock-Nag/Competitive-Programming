
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
public class sort_The_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        b = Arrays.copyOfRange(a, 0, a.length);
        Arrays.sort(b);

        int l = -1;
        int r = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                l = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                r = i;
                break;
            }
        }
        if (l == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        reverse(a, l, r);

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                System.out.println("no");
                return;
                //break;
            }

        }
        System.out.println("yes");
        System.out.println((l+1)+" "+(r+1));

    }

    public static void reverse(int[] a, int l, int r) {
        int t[] = new int[a.length];
        int j = r;
        for (int i = l; i <= r; i++) {
            t[i] = a[j];
            j--;
        }
        for (int i = l; i <= r; i++) {
            a[i] = t[i];
        }

    }

}
        //System.out.println(Arrays.toString(a));

/*for (int i = 0; i < a.length - 1; i++) {
 for (int j = 1; j < a.length; j++) {
 // System.out.println(a[i]+" i ");
 //System.out.println(a[j]+" j ");

 if (a[i] > a[j]) {
 temp = a[i];
 temp2 = a[j];
 a[i] = a[j];
 a[j] = temp;

 }

 }
 if (Arrays.equals(a, ans)) {
 System.out.println("Bingo");
 break;
 }
 //  System.out.println("");

 }*/
        //System.out.println(Arrays.toString(a));
        /*if (Arrays.equals(a, ans)) {
 System.out.println("YES");
 System.out.println(temp2 + " " + temp);
 }*/
