package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class Fair_Distribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int main = b;
        int c = 0;
        while (b % a != 0) {
            b++;
        }
        System.out.println(b - main);
      }
}
