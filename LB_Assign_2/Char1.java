class Char1
{  
public static void main(String[] args)  
{  
//inner loop  
for (int i=1; i<=5; i++)  
{  
//outer loop  
for (int j=1; j<=i; j++)  
{  
System.out.print((char)(64+j)+" ");  
}  

System.out.println("");  
}  
}  
}  