
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
public class sum_of_round_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Vector<Integer> v = new Vector<>();
            int power = 1;
            while (n > 0) {
                if (n % 10 > 0) {
                    v.add((n % 10) * power);
                }
                n = n/10;
                power=power*10;
            }
            System.out.println(v.size());
            for(int i:v){
                System.out.print(i+" ");
            }
        }
    }
}
