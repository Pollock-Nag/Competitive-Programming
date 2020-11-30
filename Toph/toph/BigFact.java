/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class GFG {

    public static void main(String[] args) throws java.lang.Exception {
        BigInteger fact = BigInteger.ONE;
        int factorialNo = 20;

        for (int i = 2; i <= factorialNo; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println("The factorial of " + factorialNo + " is: " + fact);
    }
}

    // This function finds factorial of  
// large numbers and prints them 
   /* static void factorial(int n) {
 int res[] = new int[500];

 // Initialize result 
 res[0] = 1;
 int res_size = 1;

 // Apply simple factorial formula  
 // n! = 1 * 2 * 3 * 4...*n 
 for (int x = 2; x <= n; x++) {
 res_size = multiply(x, res, res_size);
 }

 //  System.out.println("Factorial of given number is ");
 String s = "";
       
 for (int i = 3; i >= 0; i--) {
 s = s + res[i];
 }
        
 String p="0000";
 if (s.equals(p)) {
 System.out.println("0");
 } else {
 String regex = "^0+";
 System.out.println(s.replaceAll(regex, ""));
 }

       

 //System.out.println(s);
 }

 // This function multiplies x with the number 
 // represented by res[]. res_size is size of res[] or  
 // number of digits in the number represented by res[]. 
 // This function uses simple school mathematics for  
 // multiplication. This function may value of res_size 
 // and returns the new value of res_size 
 static int multiply(int x, int res[], int res_size) {
 int carry = 0; // Initialize carry 

 // One by one multiply n with individual  
 // digits of res[] 
 for (int i = 0; i < res_size; i++) {
 int prod = res[i] * x + carry;
 res[i] = prod % 10; // Store last digit of  
 // 'prod' in res[] 
 carry = prod / 10; // Put rest in carry 
 }

 // Put carry in res and increase result size 
 while (carry != 0) {
 res[res_size] = carry % 10;
 carry = carry / 10;
 res_size++;
 }
 return res_size;
 }

 // Driver program 
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 factorial(sc.nextInt());
 }
 }*/
