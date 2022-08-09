package hrushikesh;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping\n a="+a+"\n b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping\n a="+a+"\n b="+b);
		

	}

}
