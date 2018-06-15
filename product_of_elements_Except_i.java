

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{
	public static void main (String[] args) throws java.lang.Exception

	{

		
int n,i,j,g,k;

		int a[]=new int[20];

		int b[]=new int[20];

		Scanner s=new Scanner(System.in);

		n=s.nextInt();

		for(i=0;i<n;i++)

		{

			a[i]=s.nextInt();

		}

		for(i=0;i<n;i++)

		{

			g=1;

			for(j=0;j<n;j++)

			{

			if(a[i]!=a[j])

			{

			g=g*a[j];
	
		}

			}

			b[i]=g;

		}

		for(i=0;i<n;i++)

		{

			System.out.print(b[i]+" ");

		}

	}

}