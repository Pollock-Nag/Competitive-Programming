package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class homeWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       /* while (t-- > 0) {
            //  long n = sc.nextLong();
            String s = sc.next();
            long n = Long.parseLong(s);
            long dc = 0;
            while (!isPrefectSqure(n) && n != 0) {
                n = n / 10;
                dc++;

            }
            if (dc == s.length() || s.charAt(0) == '0') {
                System.out.println("-1");
            } else {
                System.out.println(dc);
            }
        }*/
        
        while(t-->0){
         String s = sc.next();
        
        }        
        
    }

    public static boolean isPrefectSqure(long n) {
        double d = Math.sqrt(n);
        if (d - Math.floor(d) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
