import java.util.Arrays;
import java.util.Scanner;

public class caps_lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String copy = a;
        String c1 = copy.toUpperCase();

        int ckr1 = 1;
        int ckr2 = 0;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) >= 'a') {
                ckr1 = 0;
            }
        }

        if (copy.equals(c1)) {
            ckr2 = 1;
        }


        if (ckr2 == 1) {
            String abar = a.toLowerCase();
            System.out.println(abar);

        } else if (ckr1 == 1) {
            String abar = a.toLowerCase();
            char c[] = abar.toCharArray();
            c[0] = Character.toUpperCase(a.charAt(0));
            for (char i : c) {
                System.out.print(i);
            }
        } else {
            System.out.println(a);
        }
    }

}
