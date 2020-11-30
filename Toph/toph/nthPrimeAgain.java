
import java.util.*;
import java.io.*;

/**
 * @author AnonymousP
 */
public class nthPrimeAgain {

    static Vector<Integer> prime_vector = new Vector<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        java.io.PrintWriter pr = new java.io.PrintWriter(System.out);
        //90000001
        sieve(7368787);
       // int t = sc.nextInt();
       // while (t-- > 0) {
            int n = sc.nextInt() - 1;
            pr.println(prime_vector.get(n));
            pr.flush();
        //}
        System.exit(0);
    }

    public static void sieve(int n) {

        boolean prime[] = new boolean[n + 1];

        /*for (int i = 0; i < n; i++) {
         prime[i] = true;
         }*/
        for (int i = 3; i * i <= n; i += 2) {
            if (prime[i] == false) {
                //ans.add(i);
                for (int j = i * i; j <= n; j += (2 * i)) {
                    prime[j] = true;

                }
                //  ans.add(i);
            }
        }
        prime[1] = true;
        prime_vector.add(2);
        int c = 0;
        for (int i = 3; i <= n; i += 2) {
            if (prime[i] == false) {

                prime_vector.add(i);
                //System.out.print(i + " ");
            }
        }

    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
