/*
 Write a program that prompts the user to input an integer and 
 then outputs the number with the digits reversed. 
 For example, if the input is 12345, the output should be 54321.
 */



import java.util.*;


public class ReverseDigitofaNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
      Scanner sc = new Scanner(System.in);
      sc.close();
      int n = sc.nextInt();
      int reverse = 0;
        while(n>0) {
        int d = n%10;
        reverse = (reverse*10) + d;
        n = n/10;
        }
        System.out.println(reverse);  
      
	}
}