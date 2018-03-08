import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
 int count=0,i,n,len;
String str;
char c;
Scanner ob=new Scanner(System.in);
str=ob.nextLine();
 len=str.length();
for(i=0;i<len;i++)
{
	c=str.charAt(i);
	if((c=='1')||(c=='0'))
	{
		count=1;
	}
}
           if(count==1)
           {
           	 System.out.println("yes");
           }
           else
           {
           	 System.out.println("no");
           }
       
}
}