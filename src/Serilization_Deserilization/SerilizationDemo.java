package Serilization_Deserilization;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) throws IOException 
	{
	emp e=new emp(1,"abc",555555555);
	
	FileOutputStream fos=new FileOutputStream("emp.txt");
	
	ObjectOutputStream bos=new ObjectOutputStream(fos);
	
	bos.writeObject(e);
	fos.close();
	System.out.println("hoo");
	}

}
