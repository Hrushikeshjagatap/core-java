package collections;

public class book implements Comparable<book>
{
	private int bid;
	private String name,author;
	private double price;
	
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(int bid, String name, String author, double price) {
		super();
		this.bid = bid;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "bid=" + bid + ", name=" + name + ", author=" + author + ", price=" + price ;
	}
	@Override
	public int compareTo(book o)
	{
	if(this.bid > o.bid)
		return 1;
	else if(this.bid<o.bid)
		return-1;
	else
	return 0;
	
	}

}
