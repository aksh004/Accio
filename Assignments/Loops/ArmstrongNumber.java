/*
 Write a program to print out all Armstrong numbers between 1 and 500. 
 If sum of cubes of each digit of the number is equal to the number itself, 
 then the number is called an Armstrong number 
 For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 
 */



 //code

 public class ArmstrongNumber 

{
	public static void main (String[] args) throws java.lang.Exception
	{
		 for(int i=1; i<=500; i++){
      int n,d,numb=0;
      n=i;
      while(n!=0){
        d=n%10;
        numb=numb+(d*d*d);
        n=n/10;
      }
      if(numb==i){
        System.out.println(numb);
      }
    }
      
      
	}
}