import java.io.*;
import java.util.*;
class add
{
    private int sum=0,avg,count=0;
    private int[] ar=new int[0];
    public void sum(int a)
    {
        ar=Arrays.copyOf(ar,ar.length+1);
        ar[count]=a;
       count++;
       sum=sum+a;
    }
    public int result()
    {
        return sum;
    }
    public int average()
    {
        return sum/count;
    }
   public int[] listElements()
    {
        return ar;
    }
}
class additionArray
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String q;
         q=b.readLine();
         add a=new add();
         int y=q.length();
         int x;
        for(int i=0,k=0;i<y;i++)
        {
           if(q.charAt(i)==' ')
            {
               x=Integer.parseInt(q.substring(k,i));
                k=i+1;
                a.sum(x);
            }
           else if(i==y-1)
           {
               x=Integer.parseInt(q.substring(k,i+1));
               a.sum(x);
           }
        }
        System.out.println("Sum : "+a.result());
        System.out.println("Avg : "+a.average());
        int[] z=a.listElements();
        System.out.println("***LIST ELEMENTS***");
        for(int i=0;i<z.length;i++)
            System.out.print(" "+z[i]);
    }
}
