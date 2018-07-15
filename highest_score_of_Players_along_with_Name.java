package javaaaaa;
import java.util.*;
/**
 *
 * @author skcet
 */
public class ex2 {
    public static void main(String args[])
    {
        int n,i,j,p,q,g;
        String name[]=new String[20];
        int seq[]=new int[20];
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number of players : ");
        n=s.nextInt();
        System.out.println("Enter the names : ");
        for(i=0;i<n;i++)
        {
            name[i]=s.next();
        }
        System.out.println("Enter the sequence : ");
        for(i=0;i<n;i++)
        {
            seq[i]=s.nextInt();
        }
       
            p=seq[0];
            System.out.print(name[0]);
            
            for(j=0;j<n;j++)
            {
                
            q=p+1;
                if(q==seq[j])
                {
                    System.out.print(" "+name[j]);
                    
                    p=seq[j];
                }
                
            }
            
        
    }
}

