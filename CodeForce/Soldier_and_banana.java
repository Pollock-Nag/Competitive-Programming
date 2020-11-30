
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
public class Soldier_and_banana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;

        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();

        long m = 0;
        for (long i = 1; i <= w; i++) {
            m += k * i;
        }
        // System.out.println("m: " + m);
        //System.out.println("K: " + k);

        if (m > n) {
            System.out.println(m - n);
        } else {
            System.out.println("0");

        }

    }
}
