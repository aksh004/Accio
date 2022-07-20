/*
 Two numbers are entered through the keyboard. 
 Write a program to find the value of one number raised to the power of another. 
 (Do not use Java built-in method)

Input Format : The first line will contain two numbers a and b

Output Format : In the output you need to print an ans denoting a raise to power b

Constraint : 1<=a,b<=15

Sample Input 1 : 5 3

Sample Output 1 : 125

Sample Input 2: 7 2

Sample Output 2: 49
 */



// code

import java.util.*;


public class PowerOfNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
      Scanner sc = new Scanner(System.in);
      sc.close();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int power = 1;
      for(int i=1;i<=b;i++){
        power = power * a;
      }
      System.out.println(power);
	}
}