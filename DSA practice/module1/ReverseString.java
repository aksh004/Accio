/******************************************************************************
Reverse a string
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		int n =s.length();
	/*	
		// method 1
		char ch; 
		
		for(int i=0;i<s.length();i++){
		    // extract each character of the string
		    ch = s.charAt(i);
		    // add each character before the existing string;
		    res = ch + res;
		}
		System.out.print(res);
	*/
	
	 
 
    
     /*
	 // method 2 Converting String to character array
	       1. First, convert String to character array
              by using the built in Java String class 
              method toCharArray().
            2. Then, scan the string from end  to start, 
                and print the character one by one.
	
    */	
            
            char[] ch = s.toCharArray();
            
            for(int i=ch.length-1;i>=0;i--){
                System.out.print(ch[i]);
            }
      
        
	}
}
