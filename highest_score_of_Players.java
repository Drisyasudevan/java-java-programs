package javaaaaa;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.*;
/**
 *
 * @author skcet
 */
public class ex1 {
  public static void main(String args[])
  {
      int n,score,i,j,temp,l=0;
      String st = null;
      char c,d;
      int a[]=new int[20];
      int sum[]=new int[20];
      String name[]=new String[20];
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number of players : ");
      n=s.nextInt();
      System.out.println("Enter the names of players : ");
      for(i=0;i<n;i++)
      {
          name[i]=s.next();
      }
      System.out.println("Enter the score : ");
      score=s.nextInt();
      if(score!=0)
      {
         st=Integer.toString(score); 
         l=st.length();
      }
      for(i=0;i<n;i++)
      {
          d=st.charAt(i);
          sum[i]=Character.getNumericValue(d);
          for(j=i+n;j<l;)
          {
           c=st.charAt(j);
          a[j]=Character.getNumericValue(c);  
              sum[i]=sum[i]+a[j];
              int p=n-1;
              j=j+p;
          }
          
          
      }
      for(i=0;i<n;i++)
          {
              for(j=i;j<n;j++)
              {
                  if(sum[i]<sum[j])
                  {
                      temp=sum[i];
                      sum[i]=sum[j];
                      sum[j]=temp;
                  }
              }
          }
       
            System.out.println(name[0]+":"+sum[0]);
          
  }
}