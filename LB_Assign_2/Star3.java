class Star3
{
	public static void main (String args[])
	{  
	    for (int i=1;i<=6;i++)//row
		{
		   for (int j=1;j<=6-i;j++)//column
		   {System.out.print("*");}
           System.out.println();	   
		}
	}
}