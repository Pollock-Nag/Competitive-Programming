
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
public class Next_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int check = a[k];
        int count = 0;
        int count0 = 0;

        for (int i = 1; i <= n; i++) {

            if (a[i] >= check && a[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
