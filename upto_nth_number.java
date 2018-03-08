import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
 int i,n,len;
String str;
char c;
Scanner ob=new Scanner(System.in);
str=ob.nextLine();
n=ob.nextInt();
 len=str.length();
for(i=0;i<len;i++)
{
	
	c=str.charAt(i);
	 System.out.print(c);
	if(i==n-1)
	{
	break;
	}
}
           
}
}