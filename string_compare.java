import java.util.*;

public class MyClass
 {
   
 public static void main(String args[])
 {
    
String s,s2;
int len1,len2;
Scanner scan=new Scanner(System.in);
s=scan.nextLine();
s2=scan.nextLine();
len1=s.length();
len2=s2.length();
if((len2>len1)||(len2==len1))
{
    System.out.print(s2);
}
 } 
   
}