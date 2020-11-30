
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
public class Letter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heading_freq[] = new int[128];
        int msg_freq[] = new int[128];

        String heading = sc.nextLine();
        String msg = sc.nextLine();

        int lenH = heading.length();

        for (int i = 0; i < lenH; i++) {
            char ch = heading.charAt(i);
            if (ch != ' ') {
                heading_freq[ch]++;
            }

        }

        int lengthMsg = msg.length();
        for (int i = 0; i < lengthMsg; i++) {
            char ch = msg.charAt(i);
            if (ch != ' ') {
                msg_freq[ch]++;
            }
        }
        boolean flag = true;

        for (char i = 'a'; i <= 'z'; i++) {
            if (heading_freq[i] < msg_freq[i]) {
                flag = false;
            }

        }
        for (char i = 'A'; i <= 'Z'; i++) {
            if (heading_freq[i] < msg_freq[i]) {
                flag = false;
            }

        }
        /*if (flag == true) {
         System.out.println("YES");
         } else {
         System.out.println("NO");
         }*/
        System.out.println(flag ? "YES" : "NO");

    }
}
