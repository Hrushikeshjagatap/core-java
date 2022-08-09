package hrushikesh;

import java.util.Scanner;

public class max3number 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		int b=sc.nextInt();
		System.out.println("enter the 3 number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is max");
		}
		else if(b>c)
		{
			System.out.println(b+" is max");
		}
		else
		{
			System.out.println(c+" is max");
		}
		/*int max=a>b ? a>c ? a :c : b>c ? b : c;
		System.out.println(max);
		*/
	}

}
