import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
int n,c=0,i;

Scanner s=new Scanner(System.in);
n=s.nextInt();
for (i=1;i<=n;i++)
    {
        if(n%i==0)
        c=c+1;
    }
    if (c!=2)
    {
    System.out.print("yes");
}
else
{
 System.out.print("no");	
}

}

}