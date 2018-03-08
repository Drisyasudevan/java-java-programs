import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{

int l,r;
double n;
Scanner s=new Scanner(System.in);

l=s.nextInt();
r=s.nextInt();
  n=l*r;
 n=Math.sqrt(n);
 if (n == Math.round(n)) {
     System.out.print("yes");
} else {
   
        System.out.print("no");
    }
}
}