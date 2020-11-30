import java.util.Scanner;
public class uri15{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter value of X1");
    double x1= sc.nextDouble();
    System.out.println("Please enter value of y1");
    double y1= sc.nextDouble();
    System.out.println("Please enter value of X2");
    double x2= sc.nextDouble();
    System.out.println("Please enter value of y2");
    double y2= sc.nextDouble();
    double distance = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.println("Distance is ="+Math.sqrt(distance));
  }
}
