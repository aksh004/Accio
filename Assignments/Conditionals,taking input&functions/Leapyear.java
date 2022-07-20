
/*
 * Given a year, find if it is a leap year.

A Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.

User Task:
Input consists of the year value as an int. You need to print 1 in case of leap year and 0 otherwise.

Sample Input:
2004

Sample Output:
1

Sample Input:
2000

Sample Output:
1

Sample Input:
1900

Sample Output:
0
 */


// code



import java.util.*;


public class Leapyear {
    public static void main(String args[]) {
       
      int year;
      
      Scanner sc = new Scanner(System.in);
      sc.close();
      year = sc.nextInt();
    if (year%400==0) {
      System.out.println(1);
    }
      else if (year%100==0){
        System.out.println(0);
      }
      else if(year%4==0) {
        System.out.println(1);
      }
        else {
          System.out.println(0);
        }
     }
}