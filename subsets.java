package javaaa;
import java.util.*;
/**
 *
 * @author skcet
 */
public class ex1 {
    public static void main(String args[])
    {
        int i,n,len,j,k,p = 0;
        int a[]={123,567,899,7899};
        String ans[]=new String[10];
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=s.nextInt();
        for(i=0;i<4;i++)
        {
            if(n==a[i])
            {
              str=Integer.toString(n);
             len=str.length();
              p=len-1;
           
                k=0;
                j=2;
               for(int m=0;m<p;m++)
        {
           
           ans[m]=str.substring(k,j);
           k++;
           j++;
           
        }
               for(i=0;i<p;i++)
               {
                   System.out.print(ans[i]+",");
               }
            }
            }
           
        }
       
        
      
    }
}