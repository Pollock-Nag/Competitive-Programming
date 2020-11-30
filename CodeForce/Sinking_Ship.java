
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pollock
 */
public class Sinking_Ship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //String a[] = new String[4];
        Vector<String> rats = new Vector<>();
        Vector<String> wc = new Vector<>();
        Vector<String> man = new Vector<>();
        Vector<String> cap = new Vector<>();

        while (t-- > 0) {
            String n = sc.next();
            String s = sc.next();
            if (s.equals("rat")) {
                rats.add(n);
            } else if (s.equals("woman") || s.equals("child")) {
                wc.add(n);
            } else if (s.equals("man")) {
                man.add(n);
            } else {
                cap.add(n);

            }
        }
        for (Object count : rats) {
            System.out.println(count);
        }
        for (Object one : wc) {
            System.out.println(one);
        }
        for (Object one : man) {
            System.out.println(one);
        }
        for (Object one : cap) {
            System.out.println(one);
        }

    }

}
