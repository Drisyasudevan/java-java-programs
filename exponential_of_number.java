

import java.util.*;
import java.lang.*;

import java.io.*;

class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int n,k,i,exp=1;
	
	
Scanner s=new Scanner(System.in);
	
n=s.nextInt();
	
k=s.nextInt();
	
for(i=1;i<=k;i++)
	
{
		
exp=exp*n;
	
}
	
System.out.print(exp);
	
	
}

}