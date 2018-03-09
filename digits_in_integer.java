

import java.util.*;

import java.lang.*;

import java.io.*;



class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
		
int n,temp,c=0,t,i;
		
int a[]=new int[20];
		
Scanner s=new Scanner(System.in);
		
n=s.nextInt();
		
temp=n;
		
while(temp!=0)
		
{
			
temp=temp/10;
			
c++;
		
}
		
for(i=c-1;i>=0;i--)
		
{
			
a[i]=n%10;
			
n=n/10;
		
}
	
for(i=0;i<c;i++)
	
{
			
System.out.print(a[i]+" ");
	
}
	
}

}