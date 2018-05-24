

import java.util.*;

import java.lang.*;

import java.io.*;
class Ideone
{

	public static void main (String[] args) throws java.lang.Exception

	{

	int n,i,j,k,l=0,temp;

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

		if(a[i]!=0){

		k=0;

		for(j=1;j<n;j++)

		{
			
		if((a[j]!=0)){

			if(a[i]==a[j])

			{

			k++;

			a[j]=0;

			}

			}

		}

	if(k>0)

	{

		b[l]=a[i];

		l++;

		
	}

		}

	}

	for(i=0;i<l;i++)

	{

		for(j=1;j<l;j++)

		{

			if(b[i]<b[j])

			{

				temp=b[i];

				b[i]=b[j];

				b[j]=temp;

			}

		}

	}

	for(i=0;i<l;i++)

	{

		System.out.print(b[i]+" ");

	}

	}

}