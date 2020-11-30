
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pollock
 */
public class DigitSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = "";
       
        for(int i=0;i<10001;i++){
        s=s+Integer.toString(i);
        }
        int i= sc.nextInt();
        System.out.println(s.charAt(i));
       
       
    }
}
