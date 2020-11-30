
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
public class sumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);

    }

    public static void function(int n) {
        int sum = 0;
        int disit = 0;

        while (n > 0) {
            disit = n % 10;
            sum = sum + disit;
            n = n / 10;

        }

        System.out.println("sum :" + sum);

    }
}
