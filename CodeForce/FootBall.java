
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

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
public class FootBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        Map<String, Integer> hm = new HashMap();
        for (String x : a) {
            if (!hm.containsKey(x)) {
                hm.put(x, 1);

            } else {
                hm.put(x, hm.get(x) + 1);
            }
        }
        //System.out.println(hm);
        int maxVal = Collections.max(hm.values());

        for (Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxVal) {
                System.out.println(entry.getKey());
            }
        }

    }
}
