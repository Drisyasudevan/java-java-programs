

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{

int n,i,j,k;

int a[]=new int[20];

Scanner s=new Scanner(System.in);

n=s.nextInt();

for(j=0;j<n;j++)

{

		if(a[j]==-1)

		{

		j++;
	
	}
		i=0;

		for(k=1;k<n;k++)

		{

			if(a[j]==a[k])

			{

				i+=1;

			
	a[k]=-1;

			}
		
		}

	if(i==0)

	{

	System.out.println(a[j]);

	}

}

}

}