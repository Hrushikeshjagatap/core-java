package hrushikesh;

import java.util.Scanner;

public class arithmaticDemo
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String ans="";
	do
	{
	System.out.println("enter the 1 number");
	int a=sc.nextInt();
	System.out.println("enter the 2 number");
	int b=sc.nextInt();
	System.out.println("Menu 1)add \n 2) sub \n 3)mul \n 4) div \n");
	System.out.println("enter the choice");
	int ch=sc.nextInt();
	switch (ch)
	{
	case 1:System.out.println("addtion="+(a+b));
		
		break;
	case 4:System.out.println("div="+((float)a/b));
	
	break;

	case 2:System.out.println("sub"+(a-b));
	
	break;

	case 3:System.out.println("multification="+(a*b));
	
	break;

	

	default:System.out.println("Invalid choice");
		break;
	}
	System.out.println("Do you want repet this step(y/n)");
	//sc.next();
	ans=sc.next();
	}
	while(ans.equals("y")||ans.equals("Y"));
	}

}
