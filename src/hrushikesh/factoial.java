package hrushikesh;

import java.util.Scanner;

public class factoial 
{

	public static void main(String[] args)
	{
		int f=1;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
		for (int i = 1; i<=n; i++) 
		{
			f=f*i;
		}
		
		System.out.println(f);
		
	}

}
