package exeption;

public class givegrade extends Exception 
{
	
		private String marks;
		public givegrade()
		{
			super();
			marks=null;
		}
		public givegrade(String m)
		{
			marks=m;
		}
		public String  getmsg()
		{
			return marks;
		}
	

}
