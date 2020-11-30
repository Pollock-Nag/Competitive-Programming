
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class sum_of_fact_lightOJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact[] = new long[25];
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1] * i;

        }
        //System.out.println("Array of fact"+Arrays.toString(fact));

        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            Stack<Integer> s = new Stack<>();
            for (int j = 20; j >= 0; j--) {
                if (fact[j] <= n) {
                    n = n - fact[j];
                    s.push(j);

                }
            }
            if (n == 0) {
                System.out.print("Case " + i + ": ");
                while (s.size() != 1) {
                    System.out.print(s.peek()+"!+");
                    s.pop();
                }
                System.out.println(s.peek()+"!");
                s.pop();

            } else {
                System.out.println("Case " + i + ": impossible");
            }

           // System.out.println("stack " + s);
        }

    }
}
