import java.util.Scanner;
public class uri9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input employee's name");
    String name = sc.next();
    System.out.println("Please input employee's salary");
    float salary =sc.nextFloat();
    System.out.println("Please input the amount sold product");
    float product=sc.nextFloat();
    float result = (product*15/100)+salary;
    System.out.printf("Total = R$ %.2f \n" ,result);
  }
}