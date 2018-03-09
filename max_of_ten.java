

import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone
{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int i,t,j;
	
int a[]=new int[10];
	
Scanner s=new Scanner(System.in);

for(i=0;i<10;i++){
	
a[i]=s.nextInt();

}


for(i=0;i<10;i++)
{
	
for(j=i+1;j<10;j++)
{

if(a[i]<a[j])

{

t=a[i];

a[i]=a[j];

a[j]=t;	

}

}

}

System.out.print(a[0]);
	
}

}