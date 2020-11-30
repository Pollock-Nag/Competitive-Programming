import java.util.Scanner;
public class cc{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int t = scan.nextInt();
int k = scan.nextInt();
int d = scan.nextInt();
 
	if(k*Math.floor((t+d)/t)<n){
		System.out.println("YES");
	      
	}
 
	else{
		System.out.println("NO");}
}
      
}