import java.io.*;
import java.util.*;
class add
{
     class node
    {	
	public int data=0;
	public node link;
    }
    private int sum=0,avg,count=0;
    public void sum(int a)
    {
       count++;
       sum=sum+a;
       insert(a);
    }
    public int result()
    {
        return sum;
    }
    public int average()
    {
        return sum/count;
    }
       
	private node head=null;
        private node temp=null;
	private void insert(int a)
	{
		node n=new node();
		n.data=a;
		if(head==null && temp==null)
                {    head=n; temp=n;}
                else
                {
                    temp.link=n;
                    temp=n;
                }
	}
	public void display()
	{
		node n4=head;
                System.out.println("***The Listed Elements are ***");
		while(n4!=null)
		{
			System.out.print(n4.data+" ");
			n4=n4.link;
		}
	}
}
class additionLinkedList
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
        a.display();
    }
}
