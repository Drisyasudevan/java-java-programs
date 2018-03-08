import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{
	public static void main (String[] args) throws java.lang.Exception

	{

	int i,sum=0,avg,n;

	int a[]=new int[20];

	Scanner s=new Scanner(System.in);

	n=s.nextInt();

	for(i=0;i<n;i++)

	{

		a[i]=s.nextInt();

	}

	for(i=0;i<n;i++)

	{

		sum=sum+a[i];

	}

	avg=sum/n;

	System.out.print(avg);

	}

}