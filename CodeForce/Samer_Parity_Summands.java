
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
public class Samer_Parity_Summands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int n1 = n - (k - 1);
            if (n1 > 0 && n1 % 2 == 1) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; ++i) {
                    System.out.print("1 ");
                }
                System.out.println(n1);
                continue;
                //break;
            }

            int n2 = n - 2 * (k - 1);
            if (n2 > 0 && n2 % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print("2 ");
                }
                System.out.println(n2);
                continue;
                //break;

            }
            System.out.println("NO");

        }

    }
}
