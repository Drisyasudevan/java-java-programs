import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int n,k,i;
	
int a[]=new int[20];
	
int b[]=new int[20];
	
Scanner s=new Scanner(System.in);

n=s.nextInt();
	
k=s.nextInt();
	
for(i=0;i<n;i++)
	
{
	
a[i]=s.nextInt();	

}

for(i=0;i<n;i++)

{
	
if(a[i]%2!=0)
	
{
		
b[i]=a[i];
	
}
	
}
	
System.out.print(b[k]);
	
}

}