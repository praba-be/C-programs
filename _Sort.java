
import java.io.*;
import java.util.*;
class ll 
{
	class node
	{	
		public int data=0;
		public ll.node link;
	}
	private ll.node head=null;
        private ll.node temp=null;
	public void insert(int a)
	{
		ll.node n=new ll.node();
		n.data=a;
		if(head==null && temp==null)
                {    head=n; temp=n;}
                else
                {
                    temp.link=n;
                    temp=n;
                    sort(n);
                }
	}
	public void display()
	{
		ll.node n4=head;
		while(n4!=null)
		{
			System.out.print("\t"+n4.data);
			n4=n4.link;
		}
	}
        private void sort(ll.node n)
	{
		ll.node t1=head;
                int x;
                while(t1!=null)
                {
                    if(t1.data<n.data)
                    {
                        t1=t1.link;
                    }
                    else
                    {
                        x=t1.data;
                        t1.data=n.data;
                        n.data=x;
                        t1=t1.link;
                    }
                    
                }
	}

}

class seqSort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String q;
         q=b.readLine();
         ll l=new ll();
         int y=q.length();
         int x;
        for(int i=0,k=0;i<y;i++)
        {
           if(q.charAt(i)==' ')
            {
               x=Integer.parseInt(q.substring(k,i));
                k=i+1;
                l.insert(x);
            }
           else if(i==y-1)
           {
               x=Integer.parseInt(q.substring(k,i+1));
               l.insert(x);
           }
        }  
        l.display();
    }
}
