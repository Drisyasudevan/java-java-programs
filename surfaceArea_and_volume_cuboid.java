
import java.util.*;

import java.lang.*;

import java.io.*;


class Ideone

{
	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int l,b,h,suface_area,volume;
	
Scanner s=new Scanner(System.in);
	
l=s.nextInt();
	b=s.nextInt();
	
h=s.nextInt();
	
suface_area=(2*l*h)+(2*l*b)+(2*b*h);
	
volume=l*b*h;
	
System.out.print(suface_area);
	

System.out.print("\n"+volume);
	
}

}