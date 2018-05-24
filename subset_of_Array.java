import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone
{

	public static void main (String[] args) throws java.lang.Exception

	{

	
int n,m,i,j,k,q=0;

	int a[]=new int[20];

	int b[]=new int[20];

	Scanner s=new Scanner(System.in);

	n=s.nextInt();

	m=s.nextInt();

	for(i=0;i<n;i++)

	{

	a[i]=s.nextInt();
	
}

	for(i=0;i<m;i++)

	{

	b[i]=s.nextInt();

	}


	for(i=0;i<m;i++)

	{

		k=0;

		for(j=0;j<n;j++)

		{

			if(b[i]==a[j])

			{

				k++;

			}

		}

		if(k>0)

		{

			q++;

		}

	}

	if(q==m)
	
	{

		System.out.print("YES");

	}

	else

	{

		System.out.print("NO");

	}

	}

}