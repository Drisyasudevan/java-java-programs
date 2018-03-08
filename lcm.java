import java.util.*;


import java.lang.*;


import java.io.*;


class Ideone


{


public static void main (String[] args) throws java.lang.Exception


{

int a,b,lcm;

Scanner s=new Scanner(System.in);

a=s.nextInt();

b=s.nextInt();
 
lcm = (a > b) ? a : b;

        
        
while(true)
        
{
            
if( lcm % a == 0 && lcm % b == 0 )
            
{
                
System.out.print(lcm);
                
break;
            
}
            
++lcm;
        
}

}


}