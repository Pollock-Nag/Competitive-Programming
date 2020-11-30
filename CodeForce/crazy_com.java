import java.util.*;

public class crazy_com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (Math.abs(a[i] - a[i - 1]) <= c) {
                count++;
            } else {
                count = 0;
                count++;
            }

        }
        System.out.println(count);
    }
}
