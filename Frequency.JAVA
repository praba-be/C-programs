import java.io.*;
import java.util.*;

class out
{
    int i,n[],j,var;
    public void check(int a[])
    {
       for(i=0;i<a.length;i++)
       {
           int count=0;
           if(a[i]!=-1)
           {
               var=a[i];
                for(j=i;j<a.length;j++)
                {
                    if(a[j]==var)
                    {
                        count++;
                        a[j]=-1;
                    }
                }
                System.out.println(var+"  "+count);
           }
       }
    }
}

class count
{
    public static void main (String args[])
    {
        int[] x;
        int size,count;
        out o=new out();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size : ");
        size=s.nextInt();
        x=new int[size];
        for(count=0;count<size;count++)
        {
              x[count]=s.nextInt();
        }
        o.check(x);
    }
}
