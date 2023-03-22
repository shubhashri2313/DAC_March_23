class Star9
{  
public static void main(String[] args)  
{  
//inner loop  
for (int i=0; i<=3; i++)  
{  
//outer loop  
for (int j=1; j<=4-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print("*");  
}   
System.out.println("");  
}  


for (int i=4; i>=0; i--)  
{  
//outer loop  
for (int j=4; j>i; j--)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print("*");  
}   
System.out.println("");  
}  
}  
}  