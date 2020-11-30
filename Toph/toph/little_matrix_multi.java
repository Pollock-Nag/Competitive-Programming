package toph;

/**
 *
 * @author Pollock
 */
import java.util.*;

public class little_matrix_multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a11 = sc.nextInt();
        int a12 = sc.nextInt();
        int a21 = sc.nextInt();
        int a22 = sc.nextInt();

        int b11 = sc.nextInt();
        int b12 = sc.nextInt();
        int b21 = sc.nextInt();
        int b22 = sc.nextInt();

        int c11 = a11 * b11 + a12 * b21;
        int c12 = a11 * b12 + a12 * b22;
        int c21 = a21 * b11 + a22 * b21;
        int c22 = a21 * b12 + a22 * b22;
        System.out.println(c11+" "+c12);
        System.out.println(c21+" "+c22);
    }

}
