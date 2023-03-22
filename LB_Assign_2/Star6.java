class Star6
{
	public static void main (String args[])
	{  
	    for (int i=1;i<=5;i++)//row
		{
		   for (int j=1;j<=5-i;j++)//column
		   {System.out.print("*");}
           System.out.println();	   
		}
	}
}