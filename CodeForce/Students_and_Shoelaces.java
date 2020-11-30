
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class Students_and_Shoelaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            a[u][v] = 1;
            a[v][u] = 1;
        }
        /*for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a.length; j++) {
         System.out.print(a[i][j] + " ");
         // System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);

         }
         System.out.println("");
         }
         System.out.println("");*/

        int ans = -1;
        boolean has = true;

        while (has) {
            has = false;
            boolean t[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 1) {
                        c++;
                    }

                }
                if (c == 1) {
                    has = true;
                    t[i] = true;
                }

            }
            for (int i = 0; i < n; i++) {
                if (t[i] == true) {
                    for (int j = 0; j < n; j++) {
                        if (a[i][j] == 1) {
                            a[i][j] = 0;
                            a[j][i] = 0;
                        }
                    }
                }

            }

            ans++;
           // System.out.println("Ans P: " + ans);
        }

        /*for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a.length; j++) {
         System.out.print(a[i][j] + " ");
         // System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);

         }
         System.out.println("");
         }*/
        System.out.println(ans);

    }

}
