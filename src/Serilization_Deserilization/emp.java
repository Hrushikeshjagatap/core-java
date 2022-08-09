
package Serilization_Deserilization;

import java.io.Serializable;

public class emp implements Serializable
{

	private int id;
	private String name;
	private double sal;
	

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
