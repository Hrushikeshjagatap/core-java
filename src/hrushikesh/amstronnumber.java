package hrushikesh;

import java.util.Scanner;

public class amstronnumber
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt(),d,s=0,o=n;
	
	for(int i=1;n!=0;i++)
	{
		d=n%10;
		s=s+d*d*d;
		n=n/10;
	}
	if(s==o)
	{
		System.out.println("amstrong number");
	}
	else
	{
		System.out.println("not amstrong");
		
	}
	}

}
