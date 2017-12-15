package arrays;
public class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("*********************************************");
		int[] arr1;  //array declaration
		arr1 = new int[5];  // array initialization
		arr1[0] = 12;
		arr1[1] = 23;
		arr1[2] = 34;
		arr1[3] = 45;
		arr1[4] = 56;
		System.out.println("5th element of array:" +arr1[4]);
		System.out.println("last two elements of array:");
		for(int i = 3; i<arr1.length; i++)
		{
		System.out.println(+arr1[i]);
		}
		System.out.println("Array Element");
		for(int i = 0; i <arr1.length;i++)
		{
			System.out.println(i);
		}
	}
}