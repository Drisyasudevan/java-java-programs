import java.util.*;


import java.lang.*;

import java.io.*;


class Ideone


{


public static void main (String[] args) throws java.lang.Exception


{

 char ch;
       int count=0;
       Scanner s=new Scanner(System.in);
       ch=s.next().charAt(0);
      
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            count=1;
        
if(count==1)
{
	System.out.print("yes");
}
else
{
System.out.print("no");	
}

}


}