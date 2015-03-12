import java.io.*;
import java.util.*;

class A
{
    private int i,j,count,var;
   public void findMajorant(int[] c)
   {
      
        for(i=0;i<c.length;i++)
       {
           int count=0;
           if(c[i]!=-1)
           {
               var=c[i];
                for(j=i;j<c.length;j++)
                {
                    if(c[j]==var)
                    {
                        count++;
                        c[j]=-1;
                    }
                }
                if(count>=((c.length/2)+1))
                    System.out.println(var+"is the majorant element");
           }
       }
   }
}

class maj
{
    public static void main(String args[])
    {
        int[] a;
        int n;
        Scanner s=new Scanner(System.in);
        A aa=new A();
        System.out.println("Enter the Size : ");
        n=s.nextInt();
        a=new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        aa.findMajorant(a);
    }
}
