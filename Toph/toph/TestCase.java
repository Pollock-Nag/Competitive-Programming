package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class TestCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int testCaseCounter = t;
        int cpul = sc.nextInt();
        int meml = sc.nextInt();
        int a[] = {0, 0, 0, 0};
        int passCounter = 0;
        while (t-- > 0) {
            int di = sc.nextInt();
            int cpui = sc.nextInt();
            int memi = sc.nextInt();

            if (cpui > cpul) {
                System.out.println("CLE");
                break;
            } else if (memi > meml) {
                System.out.println("MLE");
                break;
            } else if (di > 0) {
                System.out.println("WA");
                break;
            } else {
                passCounter++;
            }
        }
        if (passCounter == testCaseCounter) {
            System.out.println("AC");
        }

    }

}
