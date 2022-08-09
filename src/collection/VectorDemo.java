package collection;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VectorDemo extends JFrame implements ActionListener
{

		JLabel lbl1,lbl2,lbl3;
		JTextField txt1,txt2,txt3,txt4;
		JButton btnadd,btnlist,btnsearch;
		JTextArea ta;
		
		
		Vector<emp> v;
		public VectorDemo()
		{
			lbl1=new JLabel("id");
			lbl2=new JLabel("Name");
			lbl3=new JLabel("sal");
			
			txt1=new JTextField();
			txt2=new JTextField();
			txt3=new JTextField();
			txt4=new JTextField();
			
			btnadd=new JButton("add");
			btnadd.addActionListener(this);
			
			btnlist=new JButton("All List");
			btnlist.addActionListener(this);
			
			btnsearch=new JButton("search");
			btnsearch.addActionListener(this);
			
			ta=new JTextArea();
			setLayout(new GridLayout(10,2));
			
			add(lbl1);
			add(txt1);
			add(lbl2);
			add(txt2);
			add(lbl3);
			add(txt3);
			add(btnadd);
			add(btnlist);
			add(txt4);
			add(btnsearch);
			add(ta);
			
			setSize(400,400);
			setVisible(true);
			try
			{
			 v=new Vector<emp>();	
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		public static void main(String[] args) 
		{
		VectorDemo obj=new VectorDemo();
		
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==btnadd)
			{
			
				v.add(new emp(Integer.parseInt(txt1.getText()),txt2.getText(),Double.parseDouble(txt3.getText()) ));
				txt1.setText(" ");
				txt2.setText(" ");
				txt3.setText(" ");
				
			}
			else if(e.getSource()==btnlist)
			{
				
				ta.setText(" ");
				ta.append("Collection :\n"+v);
			}
			else if(e.getSource()==btnsearch)
			{
				Iterator<emp> it=v.iterator();
				boolean flag=false;
				while (it.hasNext())
				{
					emp e1 = (emp) it.next();
					ta.setText(" ");
					if(e1.getId()==Integer.parseInt(txt4.getText()))
					{
						System.out.println(e1);
						ta.append("Id="+e1.getId());
						ta.append("\n name"+e1.getName());
						ta.append("\n sal="+e1.getSalary());
						
						flag=true;
						
					}
					if(flag==false)
					{
						ta.append("match not found");
					}
				}
				
			}
					
		}

}
