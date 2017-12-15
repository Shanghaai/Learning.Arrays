package arrays;

import java.util.*;

public class Demo4
{
  public static void main(String[] args) {
	  {
		  System.out.println("/////////////////////////////////////////////////////");
		  System.out.println("Just Enter How many Number of Elements you want in your Array");
		  
		  @SuppressWarnings("resource")
		  
		Scanner scn1 = new Scanner(System.in);
		  
		  int[] x;  //array declaration means an array will be created in the memory
		  
		  int size = scn1.nextInt();
		  
		  x = new int[size];  //array initialization
		  
		  for(int i = 0;i<x.length;i++)
		  {
			  System.out.println("Enter Elements");
			  x[i] = scn1.nextInt();
		  }
		  System.out.println("Array's Elements");
		  System.out.println("__________________________");
		  for (int i = 0; i < x.length; i++)
		  { 
			  System.out.println(x[i]);
			
		  }
		  
		  		 System.out.println("_________"); 
	  }
}
}
