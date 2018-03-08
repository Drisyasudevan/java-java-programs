import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{

int n,count=0;

Scanner s=new Scanner(System.in);

n=s.nextInt();

while(n!=0)

{

n=n/10;

count++;

}

System.out.print(count);

}

}