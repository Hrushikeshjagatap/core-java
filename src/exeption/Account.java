package exeption;

import java.util.Scanner;

public class Account 
{
	private int accno;
	private double balance;
	public Account()
	{
		accno=0;
		balance=0;
	}
	public Account(int a,double b)
	{
		accno=a;
		balance=b;
	}
	public void withdraw() throws lowbalanceexception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		double amt=sc.nextDouble();
		if(amt>balance)
		{
			throw new lowbalanceexception("bal is low");
		}
		else
		{
			balance=balance-amt;
			System.out.println("after withdraw balance is="+balance);
		}
	}
	public String toString()
	{
		return "\n accno="+accno+"\n balance="+balance;
	}
}
