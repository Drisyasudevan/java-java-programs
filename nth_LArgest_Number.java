

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{
	public static void main (String[] args) throws java.lang.Exception

	{

		int n,m,i,j,temp;

		int a[]=new int[20];

		Scanner s=new Scanner(System.in);

		n=s.nextInt();

		m=s.nextInt();

		for(i=0;i<n;i++)

		{

			a[i]=s.nextInt();

		}

		for(i=0;i<n;i++)

		{

			for(j=i;j<n;j++)

			{

				if(a[i]<a[j])

				{

					temp=a[i];

					a[i]=a[j];

					a[j]=temp;

				}

			}

		}

			System.out.print(a[m-1]+" ");

	}

}