package hrushikesh;

import java.util.Scanner;

public class sumofdigit
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int d,sum=0;
	while(n!=0)
	{
		d=n%10;
		sum=d+sum;
		n=n/10;
	}
	System.out.println(sum);
	}

}
