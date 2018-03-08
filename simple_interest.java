import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{

double interest,p,t,r;
Scanner s=new Scanner(System.in);
p=s.nextDouble();
t=s.nextDouble();
r=s.nextDouble();
interest=p*(1-r*t);
System.out.print(Math.floor(interest));


}

}