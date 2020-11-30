
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class decoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = (n & 1) == 1 ? -1 : 1;
        int k = 0;
        sc.nextLine();
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        char ans[] = new char[s.length()];
        for (int i = (n + 1) / 2; i <= n && i > 0;) {
            ans[i - 1] = c[k++];
            i += j;
            j = -(j > 0 ? j + 1 : j - 1);
        }
        System.out.println(String.valueOf(ans));
    }

}

