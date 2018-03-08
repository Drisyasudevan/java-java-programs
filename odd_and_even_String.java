import java.util.*;


import java.lang.*;


import java.io.*;


class Ideone

{



public static void main (String[] args) throws java.lang.Exception


{

String str;

char c;

int len,i;

Scanner s=new Scanner(System.in);

str=s.nextLine();

len=str.length();

for(i=0;i<len;i++)

{

if(i%2==0)

{

c=str.charAt(i);
 
System.out.print(c);	

}

}
 
System.out.print(" ");
 
for(i=0;i<len;i++)

{
if(i%2!=0)

{

c=str.charAt(i);
 
System.out.print(c);	

}

}

}


}