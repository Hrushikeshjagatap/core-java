package Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo extends JFrame
{
	JMenuBar mbar;
	JMenu menu1,menu2,menu3,menu4,menu5,menu6,submenu1,submenu2;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item0;
	
	public MenuDemo(String title) 
	{
		super(title);
		
		//create Menu bar
		mbar=new JMenuBar();
		
		//create Menu object
		menu1=new JMenu("Menu1");
		menu2=new JMenu("Menu2");
		menu3=new JMenu("Menu3");
		menu4=new JMenu("Menu4");
		menu5=new JMenu("Menu5");
		menu6=new JMenu("Menu6");
		
		submenu1=new JMenu("SubMenu1");
		submenu2=new JMenu("submenu2");
		
		//create Menu object
		
		item1=new JMenuItem("Item1");
		item2=new JMenuItem("Item2");
		item3=new JMenuItem("Item3");
		item4=new JMenuItem("Item4");
		item5=new JMenuItem("Item5");
		item6=new JMenuItem("Item6");
		item7=new JMenuItem("Item7");
		item8=new JMenuItem("Item8");
		item9=new JMenuItem("Item9");
		item0=new JMenuItem("Item0");
		
		//add Menu item to Menu
		menu1.add(submenu1);
		menu1.add(submenu2);
		menu2.add(item2);
		menu3.add(item3);
		menu3.add(item4);
		menu4.add(item5);
		menu5.add(item6);
		menu6.add(item7);
		
		submenu1.add(item8);
		submenu1.add(item0);
		submenu2.add(item9);
		
		//add Menus to Menubar
		mbar.add(menu1);
		mbar.add(menu2);
		mbar.add(menu3);
		mbar.add(menu4);
		mbar.add(menu5);
		mbar.add(menu6);
		
		//set menubar for frame
		setJMenuBar(mbar);
		
		setSize(400,400);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
	MenuDemo m1=new MenuDemo("Menu Demo");

	}

}
