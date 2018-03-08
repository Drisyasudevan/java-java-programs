import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
int n,temp;

Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
	temp=n%10;
	System.out.print(temp);
	n=n/10;
}



}

}