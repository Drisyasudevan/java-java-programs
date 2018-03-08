import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{

int n,l,r,i;

Scanner s=new Scanner(System.in);
n=s.nextInt();
l=s.nextInt();
r=s.nextInt();
  for(i=l+1;i<r;i++)
  {
  	if(i==n)
  	{
  		System.out.print("yes");
  	}
  	else
  	{
  		System.out.print("no");
  	}
  }

}
}