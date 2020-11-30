    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package toph;

    import java.util.Scanner;

    /**
     *
     * @author Pollock
     */
    public class Mysterious_Sum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            String sum = "";
            for (int i = 1; i <= t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                sum = sum + (a + b) + (a - b);
                System.out.println("Case "+i+": "+sum);
                sum="";
            }
        }
    }
