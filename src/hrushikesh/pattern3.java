/*
 
 1 5
 2 4
 4 2
 5 1
  */
package hrushikesh;
 

public class pattern3 
{

	public static void main(String[] args)
	{
		int i,j;
	for(i=1,j=5; i<=5 && j>=1;i++,j--)
	{
		if(i==j)
		{
			continue;
		}
		System.out.println(i+"\t"+j);
	}

	}

}
