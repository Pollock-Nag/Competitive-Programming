
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
public class SnackTower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] checker = new boolean[n + 1];
        int max = n;
        for (int i = 1; i <= n; i++) {
            checker[a[i]] = true;

            while (max > 0 && checker[max] == true) {
                System.out.print(max-- + " ");
            }
            System.out.println("");
        }

    }
}
