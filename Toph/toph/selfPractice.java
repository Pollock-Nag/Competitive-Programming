/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Pollock
 */
public class selfPractice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        BigInteger bi = BigInteger.ONE;

        System.out.println(a1);
        System.out.println(BigInteger.valueOf(a1));
       // int a[] = new int[Integer.parseInt(br.readLine())];
        solver s = new solver();
        //s.function(a);

    }
}

class solver {

    solver() {

    }

    void function(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }
    }

}
