/*
 You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

Input:
The first line of the input contains the number 𝑛(length of array) The next n integers denotes the elements of the array.

Output:
print the index of the element if it satisfies the condition else print -1

Constraints:
1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.
Sample Input 1
4 3 6 1 0

Sample Output 1
1

Explanation
6 is the largest integer. For every other number in the array x, 6 is at least twice as big as x. The index of value 6 is 1, so we return 1.

Sample Input 2
4
1 2 3 4
Sample Output 2
-1
  
 */




import java.util.*;


public class LargestNumAtLeastTwiceofOthers
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
      Scanner sc = new Scanner(System.in);
      sc.close();
      int n = sc.nextInt();
      int []arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      if(n==0){
        System.out.println(-1);
        return;
      }
      if(n==1){
        System.out.println(0);
        return;
      }
      
    int maxnumber = arr[0];
      int maxindex = 0;
      for(int i=0;i<n;i++){
        if(arr[i]>maxnumber){
          maxnumber = arr[i];
          maxindex = i;
        }
      }
    
      
    for(int i=0;i<n;i++){
      if(maxindex != i && arr[maxindex] < 2*arr[i]){
        System.out.println(-1);
        return;
      }
    }
      System.out.println(maxindex);

}
}