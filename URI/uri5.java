import java.util.Scanner;
public class uri5{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    double avg =(x*3.5+y*7.5)/11;
    System.out.printf("MEDIA = %.5f",avg);
  }
}
