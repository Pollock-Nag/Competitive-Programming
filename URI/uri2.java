import java.util.Scanner;
public class uri2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double R= sc.nextDouble();
    double n=3.14159;
    double A= n*R*R;
    System.out.printf("A=%.4f\n", A);
  }
}