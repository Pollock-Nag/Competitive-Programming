

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Byang_Day_Out {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            //int a[] = new int[3];
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a+b>= c && b+c>=a && c+a>=b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
