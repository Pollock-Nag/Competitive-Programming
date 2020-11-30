/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Pollock
 */
public class Fortis_ortuna_Adiuvat {

    public static int graph[][];
    public static int koiJabo[];

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Pollock\\Desktop\\toph.txt");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        int n = sc.nextInt();// n =number of Countries
        int m = sc.nextInt();// m = num od flights
        int x = sc.nextInt(); // x= location of Cont.hotel
        int q = sc.nextInt();//q= number of mission
        graph = new int[n + 1][n + 1];

        //  while (sc.hasNextInt()) {
        for (int i = 0; i < m; i++) {
            int y = sc.nextInt();
            //System.out.println(y + "y");
            int z = sc.nextInt();
            //System.out.println(z + "z");
            int w = sc.nextInt();
            //System.out.println(w + "w");
            graph[y][z] = w;
        }
        int source1 = 0;
        int source2 = 0;
        int destina1 = 0;
        int destina2 = 0;
        for (int i = 0; i < t; i++) {
            source1 = sc.nextInt();

            destina1 = sc.nextInt();
            source2 = sc.nextInt();
            destina2 = sc.nextInt();
        }
        System.out.println(source1 + " s1 ");
        System.out.println(destina1 + " d1 ");

        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("");
        }
        dijMethod(source1);

    }
    
    
    public static int p[] = new int[5];
    public static int d[] = new int[5];

    public static void dijMethod(int s) {
        for (int v = 0; v < graph.length; v++) {
            d[v] = Integer.MAX_VALUE;
            p[v] = -1;
        }
        d[s] = 0;
        // do something to find min;
        for (int i = 1; i < graph.length; i++) {
            int u = min(d, check);
            check[u] = true;
            for (int v = 1; v < graph.length; v++) {
                if (!check[v] && graph[u][v] != 0 && d[u] + graph[u][v] < d[v]) {
                    p[v] = u;
                    d[v] = d[u] + graph[u][v];

                }
            }
        }
        printPath(1, 4);
        System.out.println("");
        //printPath(0, 2);
        //System.out.println("");
        //printPath(0, 3);
        //System.out.println("");
        //printPath(0, 4);
        //System.out.println("");

        //System.out.println(Arrays.toString(d));
        //System.out.println(Arrays.toString(p));
    }
    public static boolean check[] = new boolean[5];

    public static int min(int[] d, boolean[] check) {

        int key = Integer.MAX_VALUE;
        int keyIndex = -1;

        for (int i = 0; i < d.length; i++) {
            if (check[i] == false && d[i] < key) {
                key = d[i];
                keyIndex = i;
            }
        }
        return keyIndex;
    }
    public static int city[] = {0, 1, 2, 3, 4};

    public static void printPath(int start, int end) {
        int temp = end;
        String s = "";
        while (start != end) {
            s = s + " " + city[end];
            end = p[end];
        }
        //    System.out.println(s+"00000");

        System.out.print("Path from " + city[start] + " to " + city[temp] + ": ");
        String[] print = s.split(" ");

        System.out.print(city[start] + " --> ");
        for (int i = print.length - 1; i > 1; i--) {
            System.out.print(print[i] + " --> ");
        }
        System.out.println(print[1]);
        System.out.println("Cost: " + d[temp]);

        System.out.println();
    }
    
    
}
