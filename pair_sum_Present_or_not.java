

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		
int n,m,i,p,flag=0;

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

			for(int j=i;j<n;j++{

			p=a[i]+a[j];

			if(m==p)

			{

				flag=1;

			}

			}

		}

		if(flag==1)

		{

			System.out.print("YES");

		}

		else

		{

				System.out.print("NO");

		}

	}

}