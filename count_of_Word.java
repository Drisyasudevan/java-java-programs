import java.util.*;

public class MyClass
 {
   
 public static void main(String args[])
 {
    
String s;
 
   char c;

    int len,i,count=1;

    Scanner scan=new Scanner(System.in);

    s=scan.nextLine();
   
 len=s.length();
    
for(i=0;i<len;i++)
 
   {
    
  c=s.charAt(i);
 
     if(c==' ')
    
  {
    
      count++;
 
     }
   
 }
 
   System.out.print(count);

    }
 
   
}