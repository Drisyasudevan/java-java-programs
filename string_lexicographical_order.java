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

for(i=len-1;i>=0;i--)

{
	
c=str.charAt(i);
	
System.out.print(c);

}
}


}