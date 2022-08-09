package hrushikesh;

import java.util.Scanner;

public class fibonicalseriesDemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	int a=0,b=1,n,c;
	System.out.println("enter the number");
	n=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	for(int i=2;i<n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
	}

}
