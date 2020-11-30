
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
public class sumOfDigitsB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counter = 0;
        int length = s.length();
        while (length > 1) {
            int sum = 0;

            for (int i = 0; i < length; i++) {

                char a = s.charAt(i);
                if (Character.isDigit(a)) {
                    sum = sum + Integer.parseInt(String.valueOf(a));
                }

            }

            s = Integer.toString(sum);
            length = s.length();
            ++counter;
        }
        System.out.println(counter);
        System.out.println(s);
    }
}
