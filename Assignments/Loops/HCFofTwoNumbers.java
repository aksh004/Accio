/*
 Write a program that finds out HCF of two numbers a and b.

What Is HCF?

HCF or Highest Common Factor is the greatest common divisor between two numbers.

For example:

Let there be two arbitrary numbers such as 75 and 90.

75 = 3 * 5 * 5

90 = 2 * 3 * 3 * 5

Common Divisor = 3 * 5 = 15
 */


// code


import java.util.*;


public class HCFofTwoNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      sc.close();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int hcf = 0;
      for(int i=1; i<=a || i<=b;i++) {
        if(a%i == 0 && b%i == 0) {
          hcf = i;
        }
      }
        System.out.println(hcf);
	}
}