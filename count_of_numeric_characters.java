import java.util.*;

public class MyClass
 {
   
 public static void main(String args[])
 {
    
String s;
 
   char c;

    int len,i,count=0;

    Scanner scan=new Scanner(System.in);

    s=scan.nextLine();
   
 len=s.length();
    
for(i=0;i<len;i++)
 
   {
    
  c=s.charAt(i);
 
    if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
  {
    
      count++;
 
     }
   
 }
 
   System.out.print(count);

    }
 
   
}