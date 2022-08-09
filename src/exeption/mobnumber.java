package exeption;

import java.util.Scanner;

public class mobnumber
{
	private String mob;
	public mobnumber()
	{
		mob=null;
	}
	public mobnumber(String mob)
	{
		this.mob=mob;
	}
	public void getmob() throws plzcheckmobnumber
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mob no");
		mob=sc.nextLine();
		
		int a=mob.length();
		if(a==10)
		{
			System.out.println("correct");
		}
		
		
		else
		{
			throw new plzcheckmobnumber("plz check your number is not correct");
		}
		
	}
	public String toString()
	{
		return "mob no="+mob;
	}

}
