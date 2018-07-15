public class ex2 {
    public static void main(String args[])
    {
     String ln,fn,pin,st;
     String str[]=new String[20];
     int i=0;
     int n,len1,len2,q,w,p,a,lenp,r;
     char c,c1,c2;
     Scanner s=new Scanner(System.in);
     fn=s.next();
     ln=s.next();
     pin=s.next();
     n=s.nextInt();
     len1=fn.length();
     len2=ln.length();
     lenp=pin.length();
     r=lenp-1;
     if(len1==len2)
     {
       c1=fn.charAt(0);
       c2=ln.charAt(0);
       q=(int)c1;
       w=(int)c2;
       if(q<w)
       {
           p=len2-1;
           c2=ln.charAt(p);
           st=Character.toString(c2);
           str[i]=st;
         i++;  
          str[i]=fn;
          i++;
           c2=pin.charAt(r);
            st=Character.toString(c2);
           str[i]=st;
           i++;
           c2=pin.charAt(0);
            st=Character.toString(c2);
           str[i]=st;
       }
       else
       {
           a=len1-1;
           c1=fn.charAt(a);
           st=Character.toString(c1);
           str[i]=st;
         i++;  
          str[i]=ln;
          i++;
           c1=pin.charAt(r);
           st=Character.toString(c1);
           str[i]=st;
         i++;  
           c1=pin.charAt(0);
          st=Character.toString(c1);
           str[i]=st;
         
       }
     }
     else if(len1<len2)
     {
        a=len1-1;
           c1=fn.charAt(a);
          st=Character.toString(c1);
           str[i]=st;
         i++;  
           str[i]=fn;
           i++;
           c1=pin.charAt(r);
          st=Character.toString(c1);
           str[i]=st;
         i++;  
           c1=pin.charAt(0);
           st=Character.toString(c1);
           str[i]=st;
         
     }
     else
     {
        p=len2-1;
           c2=ln.charAt(p);
           st=Character.toString(c2);
           str[i]=st;
         i++;  
          str[i]=fn;
          i++;
           c2=pin.charAt(r);
            st=Character.toString(c2);
           str[i]=st;
           i++;
           c2=pin.charAt(0);
            st=Character.toString(c2);
           str[i]=st;
     }
     for(int j=0;j<4;j++)
     {
         System.out.print(str[j]);
     }
     System.out.println();
     for(int j=0;j<4;j++)
     {
         int le=str[j].length();
         for(int k=0;k<le;k++)
         {
            
             c=str[j].charAt(k);
             if(Character.isLowerCase(c))
             {
                 c=Character.toUpperCase(c);
                 System.out.print(c);
             }
             else if(Character.isUpperCase(c))
             {
                c=Character.toLowerCase(c); 
                System.out.print(c);
             }
             else
             {
                 System.out.print(c);
             }
         }
         
     }
    }
}
