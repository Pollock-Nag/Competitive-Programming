/*import java.util.*;
public class simple_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}*/


import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author AnonymousP
 * @__WHEN YOU FEEL LIKE QUITTING, THINK ABOUT WHY YOU STARTED__@
 */
//COMBINATON = nCr = n*(n-1)/2
public class simple_arithmetic {

    public static void main(String[] args) {

        int a[] = new int [5];
        int min =10;
        int max = 1000000;

        for (int i =0;i<a.length;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            a[i]= randomNum;
        }

        prln(a);
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum +=a[i];
        }

        prln("sum of these number is = "+(sum));
        close();


    }

    static FastReader sc = new FastReader();
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static Random __rand = new Random();

    //************************************************************************//
    //PAIR CLASS
    //************************************************************************//
    static class Pair implements Comparable<Pair> {
        int a, b;

        Pair() {
        }

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getFirstElem() {
            return a;
        }

        public int getSecElem() {
            return b;
        }

        /* SORT ONLY A
        @Override
        public int compareTo(Pair o) {
            if (a == o.a) return Integer.compare(b, o.b);
            return Integer.compare(a, o.a);
        }

        @Override
        public String toString() {

            return "{" + a + ", " + b + "}";

        }
        */

        //Sort Both A and B Choto theke boro//
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.b, other.b);
        }

        public static Comparator<Pair> byA = (Pair t, Pair t1) -> {
            return Integer.compare(t1.a, t.a);
        };

        public String toString() {

            return "{" + a + ", " + b + "}";

        }


    }

    //************************************************************************//

    //************************************************************************//
    //CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_//
    //*******FAST IO*************FAST IO***************FAST IO****************//
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

    // output
    static void pr(int i) {
        __out.print(i);
    }

    static void prln(int i) {
        __out.println(i);
    }

    static void pr(long l) {
        __out.print(l);
    }

    static void prln(long l) {
        __out.println(l);
    }

    static void pr(double d) {
        __out.print(d);
    }

    static void prln(double d) {
        __out.println(d);
    }

    static void pr(char c) {
        __out.print(c);
    }

    static void prln(char c) {
        __out.println(c);
    }

    static void pr(char[] s) {
        __out.print(new String(s));
    }

    static void prln(char[] s) {
        __out.println(new String(s));
    }

    static void pr(String s) {
        __out.print(s);
    }

    static void prln(String s) {
        __out.println(s);
    }

    static void pr(Object o) {
        __out.print(o);
    }

    static void prln(Object o) {
        __out.println(o);
    }

    static void prln() {
        __out.println();
    }

    static void pryes() {
        __out.println("yes");
    }

    static void pry() {
        __out.println("Yes");
    }

    static void prY() {
        __out.println("YES");
    }

    static void prno() {
        __out.println("no");
    }

    static void prn() {
        __out.println("No");
    }

    static void prN() {
        __out.println("NO");
    }

    static void pryesno(boolean b) {
        __out.println(b ? "yes" : "no");
    }


    static void pryn(boolean b) {
        __out.println(b ? "Yes" : "No");
    }

    static void prYN(boolean b) {
        __out.println(b ? "YES" : "NO");
    }

    static void prln(int... a) {
        for (int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), ++i) ;
        __out.println(a[a.length - 1]);
    }

    static void prln(long... a) {
        for (int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), ++i) ;
        __out.println(a[a.length - 1]);
    }

    static <T> void prln(Collection<T> c) {
        int n = c.size() - 1;
        Iterator<T> iter = c.iterator();
        for (int i = 0; i < n; __out.print(iter.next()), __out.print(' '), ++i) ;
        if (n >= 0) {
            __out.println(iter.next());
        } else {
            __out.println();
        }
    }

    static void h() {
        __out.println("hlfd");
        flush();
    }

    static void flush() {
        __out.flush();
    }

    static void close() {
        __out.close();
    }

    //*******FAST IO*************FAST IO***************FAST IO****************//
}

