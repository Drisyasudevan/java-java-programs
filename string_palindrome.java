import java.util.*;


import java.lang.*;

import java.io.*;


class Ideone


{


public static void main (String[] args) throws java.lang.Exception


{

 String original, reverse = ""; 
      
Scanner in = new Scanner(System.in);
 
     
      
original = in.nextLine();
 
      
int length = original.length();
 
      
for ( int i = length - 1; i >= 0; i-- )
         
reverse = reverse + original.charAt(i);
 
      
if (original.equals(reverse))
         
System.out.println("yes");
      
else
         
System.out.println("no");

}


}