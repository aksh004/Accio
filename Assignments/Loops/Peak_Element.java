/*
 An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists). Given an array arr[] of size n, find the index of first peak element. If peak element does not exist print -1.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output
Print a single integer denoting the index of first peak element in array. If no such element exists, print -1.

Constraints
1<=n<=10^6

1<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(1)

Sample Input
3
1 2 3
Sample Output
2
 */

// code




import java.util.*;


public class Peak_Element
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      sc.close();
      int n = sc.nextInt(); 
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      
      // if there is only one element in the array
        if(n==1){                          
        System.out.print(0);
        return;
      }

      // check if left most element is a peak element
        if(arr[0] > arr[1]){
          System.out.print(0);
          return;
        }
    
       // check for peak elements for the middle elements 
      for(int i=1;i<n-1;i++){
        if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
          System.out.print(i);
        return;
      }
  }
        // check if Right most element is a peak element
      if(arr[n-1] > arr[n-2]){
        System.out.print(n-1);
        return;
      }
      
         System.out.print(-1);   
      
      
      
         
	}
}