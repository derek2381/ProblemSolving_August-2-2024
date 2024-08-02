// problem link
// https://www.codechef.com/problems/EXPENSES?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    x = 1 << x;
		    
		    while(n-- > 0){
		        x >>= 1;
		    }
		    
		    System.out.println(x);
		}

	}
}
