package Menu;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MenuDemousingarray extends JFrame implements ActionListener
{
	
	Container cp;
	
	JMenuBar mbar;
	
	JMenu File,Edit;
	JMenuItem New,open,exit,save,cut,copy,paste;
	JTextArea ta;
	public MenuDemousingarray(String title) 
	{
		super(title);
		cp=getContentPane();
		
		//create Menu bar
		mbar=new JMenuBar();
		
		//create Menu object
		
		File=new JMenu("File");
		Edit=new JMenu("Edit");
		
		//create Menu object
		New=new JMenuItem("New");
		
		open=new JMenuItem("Open");
		open.addActionListener(this);
		
		exit=new JMenuItem("exit");
		exit.addActionListener(this);
		
		save=new JMenuItem("save");
		save.addActionListener(this);
		
		cut=new JMenuItem("cut");
		cut.addActionListener(this);
		
		copy=new JMenuItem("copy");
		copy.addActionListener(this);
		
		paste=new JMenuItem("paste");
		paste.addActionListener(this);
		
		
		
		//add Menu item to Menu
		File.add(New);
		File.add(open);
		File.add(save);
		File.add(open);
		File.add(exit);
		
		Edit.add(cut);
		Edit.add(copy);
		Edit.add(paste);
		
		//add Menus to Menubar
		mbar.add(File);
		mbar.add(Edit);
		
		//set menubar for frame
		setJMenuBar(mbar);
		
		ta=new JTextArea();
		cp.add(ta);
		
		setSize(400,400);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		MenuDemousingarray m1=new MenuDemousingarray("Min  Note Pad");

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exit)
		{
			this.dispose();
		}
		else if(e.getSource()==cut)
		{
			ta.cut();
		}
		else if(e.getSource()==copy)
		{
			ta.copy();
		}
		else if(e.getSource()==paste)
		{
			ta.paste();
		}
		else if(e.getSource()==open)
		{
			FileDialog fd=new FileDialog(this);
			fd.setVisible(true);
			JOptionPane.showMessageDialog(this, "File id open"+fd.getFile());  //=> Diaglog box madhe o/p
			//System.out.println(fd.getFile());    => console var o/p
		}
	}



}
