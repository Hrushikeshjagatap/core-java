package File_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo 
{

	public static void main(String[] args) throws IOException 
	{
	FileOutputStream fs=new FileOutputStream("Dmeo.txt");
	
	String s="Welcome to Profound";
	
	byte ba[]=s.getBytes();
	
	fs.write(ba);
	System.out.println("file created");
	
	fs.close();
	
FileInputStream fis=new FileInputStream("Dmeo.txt");
	
	int i;
	
	System.out.println("File content are");
	
	while((i=fis.read())!=-1)
	{
		System.out.println((char)i);
	}
	fis.close();
	
	}

}
