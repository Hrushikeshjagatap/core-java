package File_handling;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PublicKey;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad extends JFrame implements ActionListener
{
	JMenuBar mbar;
	JMenu File;
	JMenuItem Open,Exit,New,Save;
	JTextArea ta;
	JScrollPane sp;
	Container cp;
	
	public Notepad(String s)
	{
		cp=getContentPane();
		
		New=new JMenuItem("New");
		New.addActionListener(this);
		
		Save=new JMenuItem("Save");
		Save.addActionListener(this);
		
		Open=new JMenuItem("Open");
		Open.addActionListener(this);
		
		Exit=new  JMenuItem("Exit");
		Exit.addActionListener(this);
		
		File=new JMenu("File");
		
		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(Exit);
		
		mbar=new JMenuBar();
		mbar.add(File);
		
		setJMenuBar(mbar);
		
		ta=new JTextArea();
		sp=new JScrollPane(ta);
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args)
	{
	Notepad n=new Notepad("Note Demo");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
	try
	{
		if(e.getSource()==Open)
		{
			JFileChooser s=new  JFileChooser("Select File");
			s.showOpenDialog(this);
			
			//open file for reading
			
		String filename=s.getSelectedFile().getName();
			
		FileInputStream fis=new FileInputStream(filename);
			int i;
			while((i=fis.read())!=-1)
			{
				ta.append((char)i+"");
			}
			
		}
		else if(e.getSource()==Save)
		{
			JFileChooser s=new JFileChooser("save file");
			s.showSaveDialog(this);
			
			
			//open file for writing
			
			String filename=s.getSelectedFile().getName();
			
			FileOutputStream fos=new FileOutputStream(filename);
			
			byte []barr=ta.getText().getBytes();
			fos.write(barr);
			fos.close();
		}
		if(e.getSource()==Exit)
		{
			this.dispose();
		}
	}
	catch(FileNotFoundException e1)
	{
		e1.printStackTrace();
	}
	catch(IOException e1)
	{
		e1.printStackTrace();
	}
		
	}

}
