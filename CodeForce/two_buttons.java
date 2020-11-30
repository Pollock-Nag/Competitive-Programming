
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
public class two_buttons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while (a != b) {
            if (b % 2 != 0 || a > b) {
                b++;
            } else {
                b = b / 2;
            }
            c++;
        }
        System.out.println(c);
    }
}
