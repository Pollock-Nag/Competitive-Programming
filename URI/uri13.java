import java.util.Scanner;
public class uri13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ab=(((a+b)+Math.abs(a-b))/2);
    int abc=(((a+b+c)+Math.abs(ab-c))/2);
    System.out.println(abc+" eh o maior ");
  }
}