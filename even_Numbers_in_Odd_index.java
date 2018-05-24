import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone
{

	public static void main (String[] args) throws java.lang.Exception

	{

	
	int n,i,j;

	int a[]=new int[20];

	Scanner s=new Scanner(System.in);

	n=s.nextInt();

	for(i=0;i<n;i++)

	{

	a[i]=s.nextInt();
	
	}



		for(i=1;i<n;)

	{

	j=a[i]%2;

	if(j==0)

	{

		System.out.print(a[i]+" ");

	}

	i=i+2;

	}

	}

}