import java.util.Scanner;
public class uri14{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter total distance traveled (in Km)");
    int x = sc.nextInt();
    System.out.println("Please enter the spent fuel total (in liters).");
    float y = sc.nextFloat();
    float result=x/y;
    System.out.printf("%.3f ", result);
    System.out.print("km/l");
  }
}