/*
 Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year

User task: Since this is a functional problem you do not have to worry about the input. You just have to complete the function numberofdays() which contains M as a parameter.

Constraints:- 1 <= M <= 12

Output Print the number of days in the particular month.

Example Input

1
Output

31
 */


// Code




import java.util.*;

public class NumberofDays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      sc.close();
      
      int month = sc.nextInt();
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			System.out.println(31);  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			System.out.println(30);  	
		}  
		else if ( month == 2 )
		{
			System.out.println(28);  	
		} 
		else
			System.out.println("Please enter Valid Number between 1 to 12");
	}
}