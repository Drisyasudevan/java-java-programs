

import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{
	public static void main (String[] args) throws java.lang.Exception

	{

		String str;

		int l,i,p=1;

		char ch;

		Scanner s=new Scanner(System.in);
	
		str=s.next();

		l=str.length();

		for(i=1;i<=l;i++)

		{

		p=p*i;

		}

		System.out.print(p);

	}

}