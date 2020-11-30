import java.util.Scanner;
public class uri10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input code of a product 1");
    int code1 = sc.nextInt();
    System.out.println("Please input the number of units of product 1");
    int unites1 =sc.nextInt();
    System.out.println("Please input the price for one unit of product 1");
    float price1=sc.nextFloat();
    
    System.out.println("Please input code of a product 2");
    int code2 = sc.nextInt();
    System.out.println("Please input the number of units of product 2");
    int unites2 =sc.nextInt();
    System.out.println("Please input the price for one unit of product 2");
    float price2=sc.nextFloat();
    
    float sum=(unites1*price1+unites2*price2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f" , sum);
  }
}
