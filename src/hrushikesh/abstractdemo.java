package hrushikesh;

public class abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s[]=new shape[2];
		s[0]=new circle(3);
		s[1]=new rectangle(10,12);
	for (shape s1 : s)
	{
		System.out.println(s1.getClass());
		System.out.println(s1);
		s1.area();
			
		}	
	}

}
