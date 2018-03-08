import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

{
 int num;
 
Scanner ob=new Scanner(System.in);
num=ob.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
           
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
}
}