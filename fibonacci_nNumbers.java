import java.util.*;

public class MyClass 
{
  
  public static void main(String args[])
 {
 
   int n,n1=0,n2=1,n3=0,j;
 
   Scanner s=new Scanner(System.in);
  
  n=s.nextInt();
 
   for(j=0;j<n;j++)
 
   {
      
  System.out.print(n3+" ");
 
       n1=n2;
    
    n2=n3;
     
   n3=n1+n2;
   
 }
   
 }
  
  
}
