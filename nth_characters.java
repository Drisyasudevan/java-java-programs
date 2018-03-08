

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{

public static void main (String[] args) throws java.lang.Exception
	
{
	
int n,i,len;
	
String str;
	
char c;
	
Scanner s=new Scanner(System.in);
	
str=s.nextLine();
	
n=s.nextInt();
	
len=str.length();
	
for(i=n-1;i<len;i++)
	
{
	
c=str.charAt(i);


System.out.print(c);

}
	
}

}