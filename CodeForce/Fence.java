import java.util.*;
public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(Math.max(a,Math.max(b,c)+1));
        }
    }
}
