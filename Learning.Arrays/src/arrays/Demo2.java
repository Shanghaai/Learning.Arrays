package arrays;
import java.util.Scanner;
public class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("*******************************");
		@SuppressWarnings("resource")
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scn1.next();
		System.out.println("Enter your age");
		int age = scn1.nextInt();
		
		if(age>18)
		{
			System.out.println(name+" UR eligible for fucking");
		}
		else
		{
			System.out.println(name+" _get out bosdk");
		}
	}
}
