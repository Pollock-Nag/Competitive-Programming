
import java.util.Arrays;
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
public class New_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String ans="";
        for(int i=0;i<n;i++){
        ans=ans+(char)((int)'a'+i%k);
        }
        //System.out.println((int)'a');
        System.out.println(ans);
    }
    

}
