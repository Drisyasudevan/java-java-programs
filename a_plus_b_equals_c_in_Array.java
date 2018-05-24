import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone
{

	public static void main (String[] args) throws java.lang.Exception

	{

	
	int n,i,j,k,p;

	int a[]=new int[20];

	Scanner s=new Scanner(System.in);

	n=s.nextInt();

	for(i=0;i<n;i++)

	{

	a[i]=s.nextInt();
	
}


	for(i=0;i<n;i++)

	{

		for(j=i+1;j<n;j++)

		{

			for(k=0;k<n;k++)

			{

				p=a[i]+a[j];

				if(p==a[k])

				{

					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}

			}

		}

	}



	}

}