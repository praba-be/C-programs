import java.io.*;
import java.util.*;

class remove
{
   public int[] check(int[] a)
   {
       for(int i=0;i<a.length;i++)
       {
           if(a[i]<0)
           {
               for(int j=i+1;j<a.length;j++)
               {
                   a[j-1]=a[j];
               }
               a=Arrays.copyOf(a,a.length-1);
           }
       }
       return a;
   }
}


class removeNegativeElement
{
    public static void main(String args[])
    {
        int a[];
        int size;
        Scanner s=new Scanner(System.in);
        remove r=new remove();
        System.out.println("Enter Size : ");
        size=s.nextInt();
        a=new int[size];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        int[] b=r.check(a);
        for(int i=0;i<b.length;i++)
            System.out.print(" "+b[i]);
    }
}
