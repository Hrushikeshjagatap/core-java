package hrushikesh;

import java.util.Scanner;

public class revwordinString
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String s1=sc.nextLine();
	String s2[]=s1.split(" ");
		for (int i = 0; i < s2.length; i++)
		{
			
			for(int j=s1.length()-1;j>=0;j--)
			{
				System.out.println(s2[i]);
			}
		}
	}

}
