import java.util.*;


import java.lang.*;


import java.io.*;


class Ideone


{


public static void main (String[] args) throws java.lang.Exception


{

int len,i;

String str;

char c;

Scanner s=new Scanner(System.in);

str=s.nextLine();

len=str.length();

for(i=0;i<len;i++)

{

c=str.charAt(i);

if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')

{

System.out.print(c);	

}


}

}


}