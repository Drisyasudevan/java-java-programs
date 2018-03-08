import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int n,temp,flag=0;
	
Scanner s=new Scanner(System.in);
	
n=s.nextInt();

temp=n;
	
 if(n!=0)

 {
	
 while(temp!=1)
	
 {
	
 if(temp%2!=0)
	 
{

flag=1;
	 
break;
	 
}
	 	
temp=temp/2;

}

}
 
  if(flag==1)

    {
    	
System.out.print("no");
 
   }
  
  else
 
   {
  
  System.out.print("yes");	

    }
	
}

}