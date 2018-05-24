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

	for(i=0;i<n;i++)

	{

	a[i]=s.nextInt();
	
	}



	for(i=0;i<n;i++)

	{

		for(j=i+1;j<n;j++)

		{

		if(a[i]==a[j])

		{

			k=1;

			break;

		}

		else

		{

			k=0;

		}

		
}

	if(k==1)

	{

		System.out.print(a[i]);

		break;

	}

	}
	}

}