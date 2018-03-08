import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
String str;
int i,len,mid;
char c;
Scanner s=new Scanner(System.in);
str=s.nextLine();
len=str.length();
mid=(len-1)/2;
for(i=0;i<len;i++)
{
 c=str.charAt(i);
	if(i==mid)
   {
    c='*';
    }
    System.out.print(c);
}
}
}