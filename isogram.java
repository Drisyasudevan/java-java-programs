import java.util.*;


import java.lang.*;


import java.io.*;


class Ideone


{


public static void main (String[] args) throws java.lang.Exception


{

String str;


int len,i;

Scanner s=new Scanner(System.in);

str=s.nextLine();

len=str.length();

str = str.toLowerCase();
        
len = str.length();
         
        
char arr[] = str.toCharArray();
         
        
Arrays.sort(arr);
        
for(i = 0;i < len-1;i++)
        
{
            
if(arr[i] == arr[i+1])
                
System.out.print("no");
        
}
        
System.out.print("yes");

}


}