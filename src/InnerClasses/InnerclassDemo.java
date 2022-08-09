package InnerClasses;

class outer
{
	private int i=8;
	class inner
	{
		void show()
		{
			System.out.println(i);
		}
	}
	
}
public class InnerclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	outer o=new outer();
	outer.inner in=o.new inner();
	in.show();
	
	}

}
