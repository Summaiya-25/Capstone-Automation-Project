package Automation_testing;

import java.util.Vector;

public class Class3 {
	static int MOD = 1000000007 ;
	static int SIZE = 10000; 

	static Vector<Long> fact = new Vector<Long>();
	static void factorial() 
	{ 
		int i; 
		fact.add((long)1); 
		for (i = 1; i <= SIZE; i++) 
		{ 
			fact.add((fact.get(i - 1) * i) % MOD); 
		} 	} 
	static void PrintFactorial(int arr[],int n)
	{ 
		for(int i = 0; i < n; i += 1)
		{ 
			System.out.print(fact.get(arr[i])+" "); 
		} 
	} 

	public static void main(String args[])
	{ 
		int arr[] = {4, 5, 6, 7, 8, 9, 10}; 
		int n = arr.length; 
		factorial(); 
		PrintFactorial(arr,n); 
	}
} 


		    	

