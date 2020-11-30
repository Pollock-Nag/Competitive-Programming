
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
public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int k = 0; k < n; k++) {
            int a[] = new int[3];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int count1 = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 1) {
                    count1++;
                }
            }

            int r = 0;

            if (count1 >= 2) {
                r++;
                sum = sum + r;

            }

        }
        System.out.println(sum);
    }

}
