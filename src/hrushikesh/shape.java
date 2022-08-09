package hrushikesh;

public abstract class shape
{final float pi=(float) 3.14;

	public shape()
	{
		
	}
	public abstract void area();
	public void show()
	{
		System.out.println("shape in show");
	}

}
 class circle extends shape
{
	private double r;
	public circle()
	{
		super();
		
	}
	public circle(double r)
	{
		this.r=r;
	}

	@Override
	public void area() 
	{
	System.out.println("area of circle="+(pi*r*r));	
		
	}
	public String toString()
	{
		return "\n radius="+r;
	}
	
}
 class rectangle extends shape
 {
	 private double len,brd;
	 public rectangle()
	 {
		 len=brd=0;
		 
	 }
	 public rectangle(double len,double brd)
	 {
		 this.len=len;
		 this.brd=brd;
	 }
	 public String toString()
	 {
		 return "\n length="+len+"\n breadth="+brd;
	 }
	@Override
	public void area() 
	{
		System.out.println("area of rectangle="+(len*brd));
		
	}
	 
 }