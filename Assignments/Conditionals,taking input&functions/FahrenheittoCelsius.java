/*Given a temperature F in Fahrenheit, your task is to convert it into Celsius using the following equation:-

T(°c) = (T(°f) - 32)*5/9

Input

User Task: You have to take an input F and then convert Fahrenheit To Celsius.

Constraints:-

-10^3 <= F <= 10^3

Note:- It is guaranteed that F - 32 will be a multiple of 9.

Output

Return an integer containing converted temperature to Celsius.
 */



 //code

 import java.util.*;


public class FahrenheittoCelsius
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
            sc.close();
        // enter the input
         int f = sc.nextInt(); 
        int c = (f-32)*5/9;
       System.out.println(c);
    
	}
}