/*
 Find factorial of a given number where n! = n * n-1 * n-2 .....* 1.

Input
First-line consists of a single integer denoting n.
Constraints
0 <= n <= 20
Output
Output is a single line containing factorial(n)

Example
Sample Input

5
Sample Output

120
 */


// code

import java.util.*;


public class FactorialwithLoop {
    public static void main(String args[]) {
     
      Scanner sc = new Scanner(System.in);
      sc.close();
      long n = sc.nextLong();
       long factorial = 1;   // since 0! = 1 initialize factorial= 1;
      
        for(long i=1;i<=n;i++){
        factorial = factorial*i;
      }
      System.out.println(factorial);
      
    }
}