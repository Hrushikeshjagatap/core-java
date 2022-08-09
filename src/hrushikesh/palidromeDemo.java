package hrushikesh;

import java.util.Scanner;

public class palidromeDemo 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String str=sc.nextLine();
		String rev="";
		for (int i = str.length()-1; i>=0; i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("palidrome String");
		}
		else
		{
			System.out.println("not palidrome");
		}


	}

}
