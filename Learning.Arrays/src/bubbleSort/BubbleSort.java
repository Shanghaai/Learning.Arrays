package bubbleSort;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
	   int a[]= {1,2,10,5,9,40,910,0,7}; 
	   for (int i=0;i<a.length;i++)  //to read the array a[i]
	    {
		   for(int j=0;j<a.length-1;j++) //to create a new array of j[i] and read the array 
		   {
			   if (a[j]>a[j+1])        //A[j] an array of j
			   {
				   int temp = a[j]; //swapping the elements
				   a[j] = a[j+1];
				   a[j+1]=temp;
			   }
		   }
	    }
	   System.out.println("***********************************************************");
	   System.out.println("after sorting");  //just to print the sorted materials
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
	   System.out.println("*******************************************************");
	}
}
//yet to complete