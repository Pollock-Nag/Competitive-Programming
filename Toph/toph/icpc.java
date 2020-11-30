package toph;

import java.util.Arrays;
import java.util.Scanner;

public class icpc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str = sc.next();
        // long a = Long.parseLong(s);
        // System.out.println("a "+a%10);
        int num[] = new int[10];
        //String str = "1213";
        int c = str.length();
        for (int i = 0; i < str.length(); i++) {
            int d = Character.getNumericValue(str.charAt(c - 1));
            //    System.out.println();

            if (d == 0) {
                num[0]++;
            } else if (d == 1) {
                num[1]++;
            } else if (d == 2) {
                num[2]++;
            } else if (d == 3) {
                num[3]++;
            } else if (d == 4) {
                num[4]++;
            } else if (d == 5) {
                num[5]++;
            } else if (d == 6) {
                num[6]++;
            } else if (d == 7) {
                num[7]++;
            } else if (d == 8) {
                num[8]++;
            } else if (d == 9) {
                num[9]++;
            }

            c--;

        }

        /*long d = 0;
         while (a != 0) {
         d = a % 10;
         //     System.out.println("d "+d);
         if (d == 0) {
         num[0]++;
         } else if (d == 1) {
         num[1]++;
         } else if (d == 2) {
         num[2]++;
         } else if (d == 3) {
         num[3]++;
         } else if (d == 4) {
         num[4]++;
         } else if (d == 5) {
         num[5]++;
         } else if (d == 6) {
         num[6]++;
         } else if (d == 7) {
         num[7]++;
         } else if (d == 8) {
         num[8]++;
         } else if (d == 9) {
         num[9]++;
         }
         // a.length()--;
         a = a / 10;

         }*/
        int max = num[0];
        int maxI = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxI = i;
            }
        }
        System.out.println(maxI);
        // System.out.println(Arrays.toString(num));

    }
}
