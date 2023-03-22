class Star13 //mirror of K
{  
    public static void main(String[] args)  
    {  
       for (int i=4; i>=0; i--)  //inner loop 
       {  
          for (int j=4; j>i; j--) //outer loop  
          {  
            System.out.print(" ");  
          }
 		  
          for (int k=0;k<=i;k++)  
          {  
             System.out.print("*");  
          }   
          System.out.println("");  
        } 
  
    
       for (int i=1; i<=4; i++)  
        {   
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
    }
}