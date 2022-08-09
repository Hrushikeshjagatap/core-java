package hrushikesh;

import java.util.Scanner;

public class uptoprimenumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    for(int i=2;i<=n;i++)
	    {
	    	int j=2;
	    	while(j!=i)
	    	if(i%j==0)
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		j++;
	    	}
	    	if(i==j)
	    	{
	    		System.out.println(i);
	    	}
	    }
	}

}
