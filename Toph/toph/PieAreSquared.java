/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.String.format;

/**
 *
 * @author Pollock
 */
public class PieAreSquared {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // format
        
        int r = Integer.parseInt(br.readLine());
        double ans = Math.PI*r*r;
       // String ans1= format("%.10f", ans);
       // System.out.println(ans1);
        System.out.printf("%.10f", ans);
    }

}
