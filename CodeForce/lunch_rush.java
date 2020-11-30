import java.util.Scanner;

public class lunch_rush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = Integer.MIN_VALUE;
        while (n-- > 0) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            if (t > k) {
              j=Math.max(j, f - (t - k));
            } else {
                j = Math.max(j, f);
            }

        }
        System.out.println(j);
    }
}
