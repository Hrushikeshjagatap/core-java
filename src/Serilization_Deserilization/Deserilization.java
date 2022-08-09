package Serilization_Deserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {

	public static void main(String[] args) throws Exception 
	{
	FileInputStream fis=new FileInputStream("emp.txt");
	
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	emp e=(emp) ois.readObject();
	
	System.out.println(e);
	}

}
