import java.util.Scanner;
public class uri8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input employee's numbe");
    int num = sc.nextInt();
    System.out.println("Please input employee's worked hours number in a month");
    int hour=sc.nextInt();
    System.out.println("Please input the amount employee's received per hour");
    float aph=sc.nextFloat();
    float sal=aph*hour;
    System.out.println("NUMBER = "+num);
    System.out.println("SALARY = U$ "+sal);
  }
}