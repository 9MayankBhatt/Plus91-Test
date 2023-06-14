package com.app.test;

import java.util.Arrays;

public class PlusNineOneTest {

	public static int maxWeightDifference(int arr[], int n, int k)
  {
	// Sorting the array so the items with minimum weights will be at the 
	// starting of the array	
    Arrays.sort(arr);
    
    // sum1 is the sum of first 'k' number of items
    int sum1 = 0; 
    
    // sum2 is the sum of rest of the 'n-k' items
    int sum2 = 0;

    for (int i = 0; i < n; i++)
    {
    	// sum of first 'k' items
    	if(i < k)
    	{
    		sum1 += arr[i];
    	}
    	// sum of the rest 'n-k' items
    	else
    	{
    		sum2 += arr[i];
    	}
    }
    	return Math.abs(sum1 - sum2);
  }
  

	  public static void main(String[] args)
	{
		// Test case#1  
		int arr1[] = {8,4,5,2,10}; 
		  
		// number of items Chef's son will carry
		int k1 = 2;
	
		// total number of items
		int n1 = arr1.length;
	
	    System.out.println(maxWeightDifference(arr1, n1, k1)+" grams.");
	    // output = 17 grams.
	    
	    // Test case#2
	    int arr2[] = {1,1,1,1,1,1,1,1}; 
		  
		// number of items Chef's son will carry
		int k2 = 3;
	
		// total number of items
		int n2 = arr2.length;
	
	    System.out.println(maxWeightDifference(arr2, n2, k2)+" grams.");
	 // output = 2 grams.
	}
}










































