import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
Scanner ob=new Scanner(System.in);
       
        String s=ob.nextLine();

        s=" "+s;
        String cap="";
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==' ')
            {
                cap=cap+" ";
                char y=s.charAt(i+1);
                cap=cap+Character.toUpperCase(y);
                i++;
            }
            else
            {
                cap=cap+x;
            }
        }
        System.out.println(cap);
}
}