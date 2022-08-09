package collections;

public class student 	

{
	private int rno;
	private String name;
	private float mark;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int rno, String name, float mark) {
		super();
		this.rno = rno;
		this.name = name;
		this.mark = mark;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() 
	{
		return "rno=" + rno + "\n name=" + name + "\n mark=" + mark;
	}
	
	
	
	
	
	
	

}
