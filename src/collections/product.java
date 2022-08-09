package collections;

public class product implements Comparable<product>
{
	private int id;
	private String name;
	private double price;
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(product o)
	{
		if(this.price < o.price)
			return 1;
		else if(this.price>o.price)
			return-1;
		else
		return 0;
		
	}
	
	

	

}
