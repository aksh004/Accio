/*
 For an integer N, your task is to calculate the sum of first N natural numbers. 
 Input User Task: Since this will be a functional problem, you donot have to worry about input. 
 You just have to complete the function NumberSum() which takes the integer(large value possible) N as a parameter. Constraints: 1 <= N < = 100000000 Output Print the sum of first N natural numbers.

Example

Input 5 Output 15

Input 1 Output 1
 */

// code




import java.util.*;


public class SumOf_N_Naturalnumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
      Scanner sc = new Scanner(System.in);
      sc.close();
      long n = sc.nextLong();
      long sum = 0;
      for(long i=1;i<=n;i++){
       sum = sum+i;
      }
      System.out.println(sum);
	}
}