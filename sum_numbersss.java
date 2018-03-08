import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{
	public static void main (String[] args) throws java.lang.Exception

	{

	int i,sumN=0,avg,n;

	int arr[]=new int[20];

	Scanner s=new Scanner(System.in);

	n=s.nextInt();

	for(i=0;i<n;i++)

	{

		arr[i]=s.nextInt();

	}

	for(i=0;i<n;i++)

	{

		sumN=sumN+arr[i];

	}



	System.out.print(sumN);

	}

}