

import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int n,t,sum=0;
	
Scanner s=new Scanner(System.in);
	
n=s.nextInt();
	
while(n!=0)
	
{
		
t=n%10;
		
sum=sum+t;
		
n=n/10;
	
}
	
System.out.print(sum);
	
}

}