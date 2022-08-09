package Thread;

import java.util.Scanner;

public class Account 
{
	private int accno;
	//private String name;
	private double balance;
	public Account()
		{
			super();
		}
	public Account(int accno, /*String name,*/ double balance) 
	{
		super();
		this.accno = accno;
		//this.name = name;
		this.balance = balance;
	}
	public void withdraw()
	{
		System.out.println("enter the amount withdraw");
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextInt();
		if(amt > balance)
		{
			System.out.println("Insuffcient Balance");
		}
		else
		{
			balance=balance-amt;
			System.out.println("balnace="+balance);
		}
	}
	public void deposite()
	{
		System.out.println("enter the amount deposite");
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextInt();
		
			balance=balance+amt;
			System.out.println("balnace="+balance);
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getbalance() {
		return balance;
	}
	*/
	public void setbalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accno=" + accno + /*"\t Name=" + name +*/ "\t balance=" + balance;
	}
	
	

}
