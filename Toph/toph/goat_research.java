package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class goat_research {

    static Scanner sc = new Scanner(System.in);
    static int maxLen = 0;
    static String array[];
    static Vector v2 = new Vector<>();

    public static void main(String[] args) {
        int n = sc.nextInt();
        array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        finding_maxLength();
        //   System.out.println(maxLen);

        for (int i = 0; i < array.length; i++) {
            solve(array[i]);
        }
    }

    public static void finding_maxLength() {
        for (int i = 0; i < array.length; i++) {
            if (maxLen < array[i].length()) {
                maxLen = array[i].length();
            }
        }

    }

    public static void solve(String s) {

        //String s = sc.next();
        int length_a = s.length() - 1;
        Vector<Character> v = new Vector<>();

        v.insertElementAt('b', 0);

        if (length_a % 2 == 1 && length_a != 1) {
            length_a -= 1;
        } else if (length_a == 1) {
            length_a += 1;
        }
        for (int i = 1; i <= length_a; i++) {
            v.insertElementAt('a', i);
        }

        /* //System.out.println(v);
         // System.out.println(v);
         if (maxLen < v.size()) {
         maxLen = v.size();
         }*/
        //PRINTING TEST//
        Iterator it = v.iterator();

        int lenOfans = v.size();
        if (lenOfans < maxLen) {
            for (int i = 0; i < (int) ((maxLen - lenOfans) / 2); i++) {
                System.out.print(" ");
            }
            while (it.hasNext()) {
                System.out.print(it.next());
            }
            System.out.println("");

        } else if (lenOfans == v.size()) {
            while (it.hasNext()) {
                System.out.print(it.next());
            }
            System.out.println("");
        }
    }

}
