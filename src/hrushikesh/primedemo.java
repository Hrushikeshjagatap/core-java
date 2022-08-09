package hrushikesh;

import java.util.Scanner;

public class primedemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt(),i;
	for(i=2;i<=n;i++)
	{
		if(n%i==0)
		{
			break;
		}
	}
	if(i==n)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not prime");
	}

	}

}
