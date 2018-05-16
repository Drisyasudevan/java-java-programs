

import java.util.*;


import java.lang.*;


import java.io.*;



class Ideone


{


public static void main (String[] args) throws java.lang.Exception

{

int n,i,k=0,temp,j;

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

if(i==a[i])
{

	b[k]=a[i];

	k++;

}

}


for(i=0;i<k;i++)

{

	for(j=1;j<k;j++)

	{

		if(b[i]<b[j])

		{

			temp=b[i];

			b[i]=b[j];

			b[j]=temp;
		
}

	}

}

for(i=0;i<k;i++)
{

	System.out.print(b[i]+" ");

}

}


}