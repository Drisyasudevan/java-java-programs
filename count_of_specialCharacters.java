import java.util.*;

public class MyClass
 {
   
 public static void main(String args[])
 {
    
String s;
 
   char c;

    int len,spl,i,count=0;

    Scanner scan=new Scanner(System.in);

    s=scan.nextLine();
   
 len=s.length();
    
for(i=0;i<len;i++)
 
   {
    
  c=s.charAt(i);
 
       if((c<=65&&c>=90)||(c<=97&&c>=122))  
  {
    
      count++;
 
     }
   
 }
 
 spl=len-count;
   System.out.print(spl);
    }
 
   
}