
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
public class Young_Physicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        while (t-- > 0) {
            int x = sc.nextInt();
            sumx += x;
            int y = sc.nextInt();
            sumy += y;
            int z = sc.nextInt();
            sumz += z;
        
        }
        if(sumx==0 && sumy==0 && sumz==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
