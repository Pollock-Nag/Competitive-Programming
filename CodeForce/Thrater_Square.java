
import static java.lang.Math.ceil;
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
public class Thrater_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long c = sc.nextLong();

        long cm = m / c;
        long cn = n / c;
        if (m % c != 0) {
            cm++;
        }
        if (n % c != 0) {
            cn++;
        }
        System.out.println(cm * cn);
    }

}
