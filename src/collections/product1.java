package collections;

public class product1 
{
	private int pid;
	private String pname;
	private double pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product1(int pid, String pname, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "product1 [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
}
